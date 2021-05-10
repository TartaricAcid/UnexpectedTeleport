package com.github.tartaricacid.unexpectedteleport.item;

import com.github.tartaricacid.unexpectedteleport.init.BlockRegistry;
import com.github.tartaricacid.unexpectedteleport.init.ItemRegistry;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.LongNBT;
import net.minecraft.nbt.StringNBT;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.List;

public class ItemFlowerPot extends BlockItem {
    private static final String DIM_TAG_NAME = "DimTag";
    private static final String POS_TAG_NAME = "PosTag";
    private static final String FEATURE_TAG_NAME = "FeatureTag";

    public ItemFlowerPot() {
        super(BlockRegistry.FLOWER_POT.get(), new Properties().tab(ItemRegistry.TAB));
    }

    public static ItemStack setDim(String dimName, ItemStack flowerPot) {
        if (flowerPot.getItem() == ItemRegistry.FLOWER_POT.get()) {
            CompoundNBT tag = flowerPot.getTag();
            if (tag == null) {
                tag = new CompoundNBT();
            }
            tag.put(DIM_TAG_NAME, StringNBT.valueOf(dimName));
            flowerPot.setTag(tag);
        }
        return flowerPot;
    }

    public static String getDimName(ItemStack flowerPot) {
        if (flowerPot.getItem() == ItemRegistry.FLOWER_POT.get()) {
            CompoundNBT tag = flowerPot.getTag();
            if (tag != null) {
                return tag.getString(DIM_TAG_NAME);
            }
        }
        return "";
    }

    public static ItemStack setFeature(String featureName, ItemStack flowerPot) {
        if (flowerPot.getItem() == ItemRegistry.FLOWER_POT.get()) {
            CompoundNBT tag = flowerPot.getTag();
            if (tag == null) {
                tag = new CompoundNBT();
            }
            tag.put(FEATURE_TAG_NAME, StringNBT.valueOf(featureName));
            flowerPot.setTag(tag);
        }
        return flowerPot;
    }

    public static String getFeatureName(ItemStack flowerPot) {
        if (flowerPot.getItem() == ItemRegistry.FLOWER_POT.get()) {
            CompoundNBT tag = flowerPot.getTag();
            if (tag != null) {
                return tag.getString(FEATURE_TAG_NAME);
            }
        }
        return "";
    }

    public static ItemStack setPos(BlockPos pos, ItemStack flowerPot) {
        if (flowerPot.getItem() == ItemRegistry.FLOWER_POT.get()) {
            CompoundNBT tag = flowerPot.getTag();
            if (tag == null) {
                tag = new CompoundNBT();
            }
            tag.put(POS_TAG_NAME, LongNBT.valueOf(pos.asLong()));
            flowerPot.setTag(tag);
        }
        return flowerPot;
    }

    @Nullable
    public static BlockPos getPos(ItemStack flowerPot) {
        if (flowerPot.getItem() == ItemRegistry.FLOWER_POT.get()) {
            CompoundNBT tag = flowerPot.getTag();
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
