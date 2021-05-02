package com.github.tartaricacid.unexpectedteleport.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;

public class EntityMagicCircle extends Entity {
    public static EntityType<EntityMagicCircle> TYPE = EntityType.Builder
            .<EntityMagicCircle>of(EntityMagicCircle::new, EntityClassification.MISC)
            .sized(3, 0.1f)
            .build("magic_circle");

    private String dim;
    private String feature;
    @Nullable
    private BlockPos pos;

    public EntityMagicCircle(EntityType<EntityMagicCircle> type, World world) {
        super(type, world);
    }

    public EntityMagicCircle(World world, BlockPos pos) {
        super(TYPE, world);
        this.setPos(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.tickCount > 100) {
            this.remove();
        }
        if (tickCount == 75) {
            if (!level.isClientSide) {
                EntityTruck truck = new EntityTruck(level, getOnPos().above(3));
                truck.setDim(dim);
                truck.setFeature(feature);
                truck.setPos(pos);
                truck.yRot = this.yRot - 180;
                level.addFreshEntity(truck);
            }
        }
    }

    public String getDim() {
        return dim;
    }

    public void setDim(String dim) {
        this.dim = dim;
    }

    public BlockPos getPos() {
        return pos;
    }

    public void setPos(BlockPos pos) {
        this.pos = pos;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Override
    protected void defineSynchedData() {
    }

    @Override
    protected void readAdditionalSaveData(CompoundNBT compoundNBT) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundNBT compoundNBT) {

    }

    @Override
    public boolean isAttackable() {
        return false;
    }

    @Override
    public IPacket<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
