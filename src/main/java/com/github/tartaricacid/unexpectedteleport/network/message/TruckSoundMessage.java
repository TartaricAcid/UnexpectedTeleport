package com.github.tartaricacid.unexpectedteleport.network.message;

import com.github.tartaricacid.unexpectedteleport.client.audio.TruckTickSound;
import com.github.tartaricacid.unexpectedteleport.entity.EntityTruck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class TruckSoundMessage {
    private final int id;

    public TruckSoundMessage(int id) {
        this.id = id;
    }

    public static void encode(TruckSoundMessage message, PacketBuffer buf) {
        buf.writeInt(message.id);
    }

    public static TruckSoundMessage decode(PacketBuffer buf) {
        return new TruckSoundMessage(buf.readInt());
    }

    public static void handle(TruckSoundMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        if (context.getDirection().getReceptionSide().isClient()) {
            context.enqueueWork(() -> playSound(message));
        }
        context.setPacketHandled(true);
    }

    @OnlyIn(Dist.CLIENT)
    private static void playSound(TruckSoundMessage message) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            Entity e = mc.player.level.getEntity(message.id);
            if (e instanceof EntityTruck) {
                mc.getSoundManager().play(new TruckTickSound((EntityTruck) e));
            }
        }
    }
}
