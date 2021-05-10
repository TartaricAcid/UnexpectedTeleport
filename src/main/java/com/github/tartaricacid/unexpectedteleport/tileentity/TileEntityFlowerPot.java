package com.github.tartaricacid.unexpectedteleport.tileentity;

import com.github.tartaricacid.unexpectedteleport.init.TileEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.StringNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.util.Constants;

import javax.annotation.Nullable;

public class TileEntityFlowerPot extends TileEntity {
    public static final String DIM_TAG_NAME = "DimTag";
    public static final String POS_TAG_NAME = "PosTag";
    public static final String FEATURE_TAG_NAME = "FeatureTag";

    private String dim = "";
    private String feature = "";
    @Nullable
    private BlockPos pos;

    public TileEntityFlowerPot() {
        super(TileEntityRegistry.FLOWER_POT.get());
    }

    @Override
    public CompoundNBT save(CompoundNBT nbt) {
        getTileData().put(DIM_TAG_NAME, StringNBT.valueOf(dim));
        getTileData().put(FEATURE_TAG_NAME, StringNBT.valueOf(feature));
        if (pos != null) {
            getTileData().put(POS_TAG_NAME, NBTUtil.writeBlockPos(pos));
        }
        return super.save(nbt);
    }

    @Override
    public void load(BlockState state, CompoundNBT nbt) {
        super.load(state, nbt);
        dim = getTileData().getString(DIM_TAG_NAME);
        feature = getTileData().getString(FEATURE_TAG_NAME);
        if (getTileData().contains(POS_TAG_NAME, Constants.NBT.TAG_COMPOUND)) {
            pos = NBTUtil.readBlockPos(getTileData().getCompound(POS_TAG_NAME));
        }
    }

    public String getDim() {
        return dim;
    }

    public String getFeature() {
        return feature;
    }

    @Nullable
    public BlockPos getPos() {
        return pos;
    }

    public void setData(String dim, String feature, @Nullable BlockPos pos) {
        this.dim = dim;
        this.feature = feature;
        this.pos = pos;
        setChanged();
    }
}
