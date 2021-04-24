package com.github.tartaricacid.unexpectedteleport.event;

import com.github.tartaricacid.unexpectedteleport.network.NetworkHandler;
import com.github.tartaricacid.unexpectedteleport.network.message.FogMessage;
import com.github.tartaricacid.unexpectedteleport.util.TruckTeleporter;
import com.google.common.collect.Maps;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
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
            Iterator<UUID> it = SCHEDULED.keySet().iterator();
            while (it.hasNext()) {
                UUID uuid = it.next();
                PlayerEntity player = world.getPlayerByUUID(uuid);
                TeleportInfo info = SCHEDULED.get(uuid);
                if (player != null) {
                    teleport(world, player, info.getDim(), info.getPos());
                }
                SCHEDULED.remove(uuid);
            }
        }
    }

    private static void teleport(World world, PlayerEntity playerEntity, String dim, @Nullable BlockPos pos) {
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
                Vector3d vec3d = pos == null ?
                        playerEntity.getPosition(1).add(0, 256, 0)
                        : new Vector3d(pos.getX(), pos.getY(), pos.getZ());
                playerEntity.changeDimension(changeDim, new TruckTeleporter(vec3d));
                NetworkHandler.sendToClientPlayer(new FogMessage(), playerEntity);
            }
        }
    }

    public static class TeleportInfo {
        private String dim;
        @Nullable
        private BlockPos pos;

        public TeleportInfo(String dim, @Nullable BlockPos pos) {
            this.dim = dim;
            this.pos = pos;
        }

        public String getDim() {
            return dim;
        }

        @Nullable
        public BlockPos getPos() {
            return pos;
        }
    }
}
