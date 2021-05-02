package com.github.tartaricacid.unexpectedteleport.entity;

import com.github.tartaricacid.unexpectedteleport.event.ScheduledTeleportEvent;
import com.github.tartaricacid.unexpectedteleport.network.NetworkHandler;
import com.github.tartaricacid.unexpectedteleport.network.message.TruckSoundMessage;
import com.google.common.collect.Lists;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class EntityTruck extends LivingEntity {
    public static EntityType<EntityTruck> TYPE = EntityType.Builder.
            <EntityTruck>of(EntityTruck::new, EntityClassification.MISC)
            .sized(3, 3)
            .clientTrackingRange(10)
            .build("truck");

    private List<UUID> storageUUID = Lists.newArrayList();
    private String dim;
    private String feature;
    @Nullable
    private BlockPos pos;

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
            List<PlayerEntity> players = level.getLoadedEntitiesOfClass(PlayerEntity.class, getBoundingBox(), playerEntity ->
                    playerEntity.isAlive() && !storageUUID.contains(playerEntity.getUUID()));
            for (PlayerEntity p : players) {
                if (!storageUUID.contains(p.getUUID())) {
                    storageUUID.add(p.getUUID());
                    ScheduledTeleportEvent.addScheduledTeleport(p.getUUID(), new ScheduledTeleportEvent.TeleportInfo(dim, feature, pos));
                }
            }
        }
        if (tickCount > 20) {
            setDeltaMovement(getLookAngle().scale(-1));
            if (!isNoGravity()) {
                setDeltaMovement(getDeltaMovement().add(0, -0.04, 0));
            }
        }
        if (tickCount == 20) {
            NetworkHandler.sendToNearby(level, blockPosition(), new TruckSoundMessage(getId()));
        }
        if (tickCount > 150) {
            remove();
            level.explode(this, this.getX(), this.getY(), this.getZ(), 1.0f, Explosion.Mode.NONE);
        }
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

    public String getDim() {
        return dim;
    }

    public void setDim(String dim) {
        this.dim = dim;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Nullable
    public BlockPos getPos() {
        return pos;
    }

    public void setPos(@Nullable BlockPos pos) {
        this.pos = pos;
    }
}
