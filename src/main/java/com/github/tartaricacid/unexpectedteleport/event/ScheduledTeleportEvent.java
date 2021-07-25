package com.github.tartaricacid.unexpectedteleport.event;

import com.github.tartaricacid.unexpectedteleport.network.NetworkHandler;
import com.github.tartaricacid.unexpectedteleport.network.message.FogMessage;
import com.github.tartaricacid.unexpectedteleport.util.TruckTeleporter;
import com.google.common.collect.Maps;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;

@Mod.EventBusSubscriber()
public class ScheduledTeleportEvent {
    private static final HashMap<UUID, TeleportInfo> SCHEDULED = Maps.newHashMap();

    public static void addScheduledTeleport(UUID uuid, TeleportInfo info) {
        SCHEDULED.put(uuid, info);
    }

    @SubscribeEvent
    public static void onPostWorldTick(TickEvent.WorldTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            World world = event.world;
            for (UUID uuid : SCHEDULED.keySet()) {
                PlayerEntity player = world.getPlayerByUUID(uuid);
                TeleportInfo info = SCHEDULED.get(uuid);
                if (player != null) {
                    teleport(world, player, info.getDim(), info.getFeature(), info.getPos());
                }
                SCHEDULED.remove(uuid);
            }
        }
    }

    private static void teleport(World world, PlayerEntity playerEntity, @Nullable String dim, @Nullable String feature, @Nullable BlockPos pos) {
        if (dim == null) {
            return;
        }
        if (world instanceof ServerWorld) {
            MinecraftServer server = world.getServer();
            RegistryKey<World> registryKey = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(dim));
            ServerWorld changeDim = null;
            if (server != null) {
                changeDim = server.getLevel(registryKey);
            }
            if (changeDim != null && !playerEntity.isPassenger()) {
                // 优先级关系
                // 1. playerPos.featurePos y 256
                // 2. pos
                // 3. playerPos y 256
                Vector3d vec3d;
                BlockPos featurePos = getFeaturePos(changeDim, playerEntity.getEyePosition(1), feature);

                if (featurePos != null) {
                    vec3d = new Vector3d(featurePos.getX(), featurePos.getY(), featurePos.getZ());
                } else if (pos != null) {
                    vec3d = new Vector3d(pos.getX(), pos.getY(), pos.getZ());
                } else {
                    vec3d = setYHighest(playerEntity.getEyePosition(1));
                }
                playerEntity.changeDimension(changeDim, new TruckTeleporter(vec3d));
                playerEntity.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 200, 5, true, false, false));
                NetworkHandler.sendToClientPlayer(new FogMessage(), playerEntity);
            }
        }
    }

    @Nullable
    private static BlockPos getFeaturePos(ServerWorld changeDim, Vector3d startPos, @Nullable String feature) {
        if (feature == null) {
            return null;
        }
        BlockPos featurePos = null;
        Structure<?> structure = Structure.STRUCTURES_REGISTRY.get(feature.toLowerCase(Locale.US));
        if (structure != null) {
            featurePos = changeDim.findNearestMapFeature(structure, new BlockPos(startPos), 20, false);
            if (featurePos != null) {
                featurePos = setYHighest(featurePos);
            }
        }
        return featurePos;
    }

    private static Vector3d setYHighest(Vector3d vector3d) {
        return new Vector3d(vector3d.x, 256, vector3d.z);
    }

    private static BlockPos setYHighest(BlockPos blockPos) {
        return new BlockPos(blockPos.getX(), 256, blockPos.getZ());
    }

    public static class TeleportInfo {
        private final String dim;
        private final String feature;
        private final BlockPos pos;

        public TeleportInfo(String dim, String feature, @Nullable BlockPos pos) {
            this.dim = dim;
            this.feature = feature;
            this.pos = pos;
        }

        @Nullable
        public String getDim() {
            return dim;
        }

        @Nullable
        public String getFeature() {
            return feature;
        }

        @Nullable
        public BlockPos getPos() {
            return pos;
        }
    }
}
