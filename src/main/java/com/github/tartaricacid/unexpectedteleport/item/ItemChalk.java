package com.github.tartaricacid.unexpectedteleport.item;

import com.github.tartaricacid.unexpectedteleport.entity.EntityMagicCircle;
import com.github.tartaricacid.unexpectedteleport.util.TeleportData;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

import static com.github.tartaricacid.unexpectedteleport.init.ItemRegistry.TAB;

public class ItemChalk extends Item {
    public ItemChalk() {
        super(new Properties().tab(TAB).stacksTo(1));
        TeleportData.addType("chalk", this);
    }

    @Override
    public void fillItemCategory(ItemGroup itemGroup, NonNullList<ItemStack> stacks) {
        if (allowdedIn(itemGroup)) {
            TeleportData.addItemCategory(stacks, this);
        }
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
        Direction face = context.getClickedFace();
        World world = context.getLevel();
        if (face == Direction.UP && player != null && context.getHand() == Hand.MAIN_HAND) {
            if (!world.isClientSide) {
                EntityMagicCircle magicCircle = new EntityMagicCircle(world, context.getClickedPos().above());
                magicCircle.setDim(TeleportData.getDimName(context.getItemInHand()));
                magicCircle.setFeature(TeleportData.getFeatureName(context.getItemInHand()));
                magicCircle.setPos(TeleportData.getPos(context.getItemInHand()));
                magicCircle.yRot = player.yRot;
                world.addFreshEntity(magicCircle);
            }
            context.getItemInHand().shrink(1);
            player.getCooldowns().addCooldown(this, 100);
            return ActionResultType.SUCCESS;
        }
        return super.useOn(context);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> components, ITooltipFlag tooltipFlag) {
        TeleportData.addHoverText(stack, components);
    }
}
