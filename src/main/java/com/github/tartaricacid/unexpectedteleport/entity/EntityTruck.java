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
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.IPacket;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class EntityTruck extends LivingEntity {
    private static final String DIM_TAG_NAME = "DimTag";
    private static final String POS_TAG_NAME = "PosTag";
    private static final String FEATURE_TAG_NAME = "FeatureTag";
    private static final int START_AGE = 20;
    private static final int MAX_AGE = 80;
    public static EntityType<EntityTruck> TYPE = EntityType.Builder.
            <EntityTruck>of(EntityTruck::new, EntityClassification.MISC)
            .sized(3, 3)
            .clientTrackingRange(10)
            .build("truck");
    private final List<UUID> storageUUID = Lists.newArrayList();
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
        if (tickCount > START_AGE) {
            setDeltaMovement(getLookAngle().scale(-1));
            if (!isNoGravity()) {
                setDeltaMovement(getDeltaMovement().add(0, -0.04, 0));
            }
        }
        if (tickCount == START_AGE) {
            NetworkHandler.sendToNearby(level, blockPosition(), new TruckSoundMessage(getId()));
        }
        if (tickCount > MAX_AGE) {
            remove();
            level.explode(this, this.getX(), this.getY(), this.getZ(), 1.0f, Explosion.Mode.NONE);
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundNBT nbt) {
        super.readAdditionalSaveData(nbt);
        if (nbt.contains(DIM_TAG_NAME, Constants.NBT.TAG_STRING)) {
            dim = nbt.getString(DIM_TAG_NAME);
        }
        if (nbt.contains(POS_TAG_NAME, Constants.NBT.TAG_COMPOUND)) {
            pos = NBTUtil.readBlockPos(nbt.getCompound(POS_TAG_NAME));
        }
        if (nbt.contains(FEATURE_TAG_NAME, Constants.NBT.TAG_STRING)) {
            feature = nbt.getString(FEATURE_TAG_NAME);
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundNBT nbt) {
        super.addAdditionalSaveData(nbt);
        nbt.putString(DIM_TAG_NAME, dim);
        if (pos != null) {
            nbt.put(POS_TAG_NAME, NBTUtil.writeBlockPos(pos));
        }
        nbt.putString(FEATURE_TAG_NAME, feature);
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
