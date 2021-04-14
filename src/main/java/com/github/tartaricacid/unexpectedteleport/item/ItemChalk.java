package com.github.tartaricacid.unexpectedteleport.item;

import com.github.tartaricacid.unexpectedteleport.entity.EntityMagicCircle;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import static com.github.tartaricacid.unexpectedteleport.init.ItemRegistry.TAB;

public class ItemChalk extends Item {
    public ItemChalk() {
        super(new Properties().tab(TAB).stacksTo(1));
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
        Direction face = context.getClickedFace();
        World world = context.getLevel();
        BlockState block = world.getBlockState(context.getClickedPos());
        if (face == Direction.UP && block.getBlock() == Blocks.GRASS_BLOCK && player != null) {
            if (!world.isClientSide) {
                EntityMagicCircle magicCircle = new EntityMagicCircle(world, context.getClickedPos().above());
                magicCircle.yRot = player.yRot;
                world.addFreshEntity(magicCircle);
            }
            return ActionResultType.SUCCESS;
        }
        return super.useOn(context);
    }
}
