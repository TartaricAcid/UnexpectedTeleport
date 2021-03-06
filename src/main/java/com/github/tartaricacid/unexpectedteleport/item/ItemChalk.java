package com.github.tartaricacid.unexpectedteleport.item;

import com.github.tartaricacid.unexpectedteleport.entity.EntityMagicCircle;
import com.github.tartaricacid.unexpectedteleport.init.ItemRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.LongNBT;
import net.minecraft.nbt.StringNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.List;

import static com.github.tartaricacid.unexpectedteleport.init.ItemRegistry.TAB;

public class ItemChalk extends Item {
    private static final String DIM_TAG_NAME = "DimTag";
    private static final String POS_TAG_NAME = "PosTag";
    private static final String FEATURE_TAG_NAME = "FeatureTag";

    public ItemChalk() {
        super(new Properties().tab(TAB).stacksTo(1));
    }

    public static ItemStack setDim(String dimName, ItemStack chalk) {
        if (chalk.getItem() == ItemRegistry.CHALK.get()) {
            CompoundNBT tag = chalk.getTag();
            if (tag == null) {
                tag = new CompoundNBT();
            }
            tag.put(DIM_TAG_NAME, StringNBT.valueOf(dimName));
            chalk.setTag(tag);
        }
        return chalk;
    }

    public static String getDimName(ItemStack chalk) {
        if (chalk.getItem() == ItemRegistry.CHALK.get()) {
            CompoundNBT tag = chalk.getTag();
            if (tag != null) {
                return tag.getString(DIM_TAG_NAME);
            }
        }
        return "";
    }

    public static ItemStack setFeature(String featureName, ItemStack chalk) {
        if (chalk.getItem() == ItemRegistry.CHALK.get()) {
            CompoundNBT tag = chalk.getTag();
            if (tag == null) {
                tag = new CompoundNBT();
            }
            tag.put(FEATURE_TAG_NAME, StringNBT.valueOf(featureName));
            chalk.setTag(tag);
        }
        return chalk;
    }

    public static String getFeatureName(ItemStack chalk) {
        if (chalk.getItem() == ItemRegistry.CHALK.get()) {
            CompoundNBT tag = chalk.getTag();
            if (tag != null) {
                return tag.getString(FEATURE_TAG_NAME);
            }
        }
        return "";
    }

    public static ItemStack setPos(BlockPos pos, ItemStack chalk) {
        if (chalk.getItem() == ItemRegistry.CHALK.get()) {
            CompoundNBT tag = chalk.getTag();
            if (tag == null) {
                tag = new CompoundNBT();
            }
            tag.put(POS_TAG_NAME, LongNBT.valueOf(pos.asLong()));
            chalk.setTag(tag);
        }
        return chalk;
    }

    @Nullable
    public static BlockPos getPos(ItemStack chalk) {
        if (chalk.getItem() == ItemRegistry.CHALK.get()) {
            CompoundNBT tag = chalk.getTag();
            if (tag != null && tag.contains(POS_TAG_NAME, Constants.NBT.TAG_LONG)) {
                return BlockPos.of(tag.getLong(POS_TAG_NAME));
            }
        }
        return null;
    }

    @Override
    public void fillItemCategory(ItemGroup itemGroup, NonNullList<ItemStack> stacks) {
        if (allowdedIn(itemGroup)) {
            stacks.add(setDim("minecraft:overworld", setFeature("Desert_Pyramid", getDefaultInstance())));
            stacks.add(setDim("minecraft:overworld", setFeature("Swamp_Hut", getDefaultInstance())));
            stacks.add(setDim("minecraft:overworld", setFeature("Ocean_Ruin", getDefaultInstance())));
            stacks.add(setDim("minecraft:overworld", setFeature("Village", getDefaultInstance())));
            stacks.add(setDim("minecraft:overworld", setFeature("Igloo", getDefaultInstance())));
            stacks.add(setDim("minecraft:overworld", setFeature("Jungle_Pyramid", getDefaultInstance())));
        }
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
        Direction face = context.getClickedFace();
        World world = context.getLevel();
        BlockState block = world.getBlockState(context.getClickedPos());
        if (face == Direction.UP && player != null && context.getHand() == Hand.MAIN_HAND) {
            if (!world.isClientSide) {
                EntityMagicCircle magicCircle = new EntityMagicCircle(world, context.getClickedPos().above());
                magicCircle.setDim(getDimName(context.getItemInHand()));
                magicCircle.setFeature(getFeatureName(context.getItemInHand()));
                magicCircle.setPos(getPos(context.getItemInHand()));
                magicCircle.yRot = player.yRot;
                world.addFreshEntity(magicCircle);
            }
            context.getItemInHand().shrink(1);
            return ActionResultType.SUCCESS;
        }
        return super.useOn(context);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> components, ITooltipFlag tooltipFlag) {
        components.add(new TranslationTextComponent("tooltips.unexpectedteleport.chalk.dim", getDimName(stack)));
        BlockPos pos = getPos(stack);
        if (pos != null) {
            components.add(new TranslationTextComponent("tooltips.unexpectedteleport.chalk.pos", pos.getX(), pos.getY(), pos.getZ()));
        }
        String feature = getFeatureName(stack);
        if (StringUtils.isNotBlank(feature)) {
            components.add(new TranslationTextComponent("tooltips.unexpectedteleport.chalk.feature", getFeatureName(stack)));
        }
    }
}
