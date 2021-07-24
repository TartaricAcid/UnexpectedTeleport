package com.github.tartaricacid.unexpectedteleport.block;

import com.github.tartaricacid.unexpectedteleport.item.ItemFlowerPot;
import com.github.tartaricacid.unexpectedteleport.tileentity.TileEntityFlowerPot;
import com.github.tartaricacid.unexpectedteleport.util.TeleportData;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.StringNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockFlowerPot extends FallingBlock {
    private static final VoxelShape SHAPE = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);

    public BlockFlowerPot() {
        super(Properties.copy(Blocks.FLOWER_POT));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TileEntityFlowerPot();
    }

    @Override
    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.isEmptyBlock(pos.below()) || isFree(world.getBlockState(pos.below())) && pos.getY() >= 0) {
            FallingBlockEntity entity = new FallingBlockEntity(world, (double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D, world.getBlockState(pos));
            TileEntity te = world.getBlockEntity(pos);
            if (te instanceof TileEntityFlowerPot) {
                TileEntityFlowerPot flowerPot = (TileEntityFlowerPot) te;
                CompoundNBT nbt = new CompoundNBT();
                CompoundNBT forgeNbt = new CompoundNBT();

                forgeNbt.put(TileEntityFlowerPot.DIM_TAG_NAME, StringNBT.valueOf(flowerPot.getDim()));
                forgeNbt.put(TileEntityFlowerPot.FEATURE_TAG_NAME, StringNBT.valueOf(flowerPot.getFeature()));
                if (flowerPot.getPos() != null) {
                    forgeNbt.put(TileEntityFlowerPot.POS_TAG_NAME, NBTUtil.writeBlockPos(flowerPot.getPos()));
                }

                nbt.put("ForgeData", forgeNbt);
                entity.blockData = nbt;
            }
            entity.setHurtsEntities(true);
            world.addFreshEntity(entity);
        }
    }

    @Override
    public void setPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity entity, ItemStack stack) {
        super.setPlacedBy(world, pos, state, entity, stack);
        TileEntity te = world.getBlockEntity(pos);
        if (te instanceof TileEntityFlowerPot) {
            String dim = TeleportData.getDimName(stack);
            String feature = TeleportData.getFeatureName(stack);
            BlockPos storePos = TeleportData.getPos(stack);
            ((TileEntityFlowerPot) te).setData(dim, feature, storePos);
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
}
