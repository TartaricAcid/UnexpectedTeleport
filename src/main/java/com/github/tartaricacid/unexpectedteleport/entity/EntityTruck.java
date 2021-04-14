package com.github.tartaricacid.unexpectedteleport.entity;

import com.github.tartaricacid.unexpectedteleport.init.SoundRegister;
import com.github.tartaricacid.unexpectedteleport.util.TruckTeleporter;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.HandSide;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkHooks;

import java.util.Collections;

public class EntityTruck extends LivingEntity {
    public static EntityType<EntityTruck> TYPE = EntityType.Builder.
            <EntityTruck>of(EntityTruck::new, EntityClassification.MISC)
            .sized(3, 3)
            .clientTrackingRange(10)
            .build("truck");

    public EntityTruck(EntityType<EntityTruck> type, World world) {
        super(type, world);
    }

    public EntityTruck(World world, BlockPos pos) {
        super(TYPE, world);
        this.setPos(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
    }

    @Override
    public void tick() {
        super.tick();
        if (level instanceof ServerWorld) {
            RayTraceResult hitResult = ProjectileHelper.getHitResult(this, this::canHitEntity);
            if (hitResult.getType() == RayTraceResult.Type.ENTITY) {
                EntityRayTraceResult hitResultEntity = (EntityRayTraceResult) hitResult;
                Entity e = hitResultEntity.getEntity();
                MinecraftServer server = level.getServer();
                RegistryKey<World> registryKey = this.level.dimension() == World.NETHER ? World.OVERWORLD : World.NETHER;
                ServerWorld changeDim = null;
                if (server != null) {
                    changeDim = server.getLevel(registryKey);
                }
                if (changeDim != null && server.isNetherEnabled() && !e.isPassenger()) {
                    ServerWorld finalChangeDim = changeDim;
                    server.addTickable(() -> e.changeDimension(finalChangeDim,
                            new TruckTeleporter(e.getPosition(1)
                                    .add(0, 200, 0))));
                }
            }
        }
        if (tickCount > 20) {
            setDeltaMovement(getLookAngle().scale(-1));
        }
        if (tickCount == 20) {
            this.playSound(SoundRegister.TRUCK.get(), 5.0f, 1.0f);
        }
        if (tickCount > 150) {
            remove();
            level.explode(this, this.getX(), this.getY(), this.getZ(), 5.0f, Explosion.Mode.NONE);
        }
    }

    protected boolean canHitEntity(Entity e) {
        return !e.isSpectator() && e.isPickable() && e.isAlive();
    }

    @Override
    public Iterable<ItemStack> getArmorSlots() {
        return Collections.emptyList();
    }

    @Override
    public ItemStack getItemBySlot(EquipmentSlotType slotType) {
        return ItemStack.EMPTY;
    }

    @Override
    public void setItemSlot(EquipmentSlotType slotType, ItemStack stack) {
    }

    @Override
    public HandSide getMainArm() {
        return HandSide.RIGHT;
    }

    @Override
    public IPacket<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
