package com.github.tartaricacid.unexpectedteleport.network.message;

import com.github.tartaricacid.unexpectedteleport.client.event.FogEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class FogMessage {
    public static void encode(FogMessage message, PacketBuffer buf) {
    }

    public static FogMessage decode(PacketBuffer buf) {
        return new FogMessage();
    }

    public static void handle(FogMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        if (context.getDirection().getReceptionSide().isClient()) {
            context.enqueueWork(() -> {
                Minecraft mc = Minecraft.getInstance();
                if (mc.player != null) {
                    FogEvent.setFogTick();
                }
            });
        }
        context.setPacketHandled(true);
    }
}
