package com.github.tartaricacid.unexpectedteleport.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class EntityMagicCircle extends Entity {
    public static EntityType<EntityMagicCircle> TYPE = EntityType.Builder
            .<EntityMagicCircle>of(EntityMagicCircle::new, EntityClassification.MISC)
            .sized(3, 0.1f)
            .build("magic_circle");


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
                truck.yRot = this.yRot - 180;
                level.addFreshEntity(truck);
            }
        }
    }

    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundNBT p_70037_1_) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundNBT p_213281_1_) {

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
