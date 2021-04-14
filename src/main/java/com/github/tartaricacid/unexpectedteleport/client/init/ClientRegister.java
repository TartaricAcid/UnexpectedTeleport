package com.github.tartaricacid.unexpectedteleport.client.init;

import com.github.tartaricacid.unexpectedteleport.client.render.MagicCircleRender;
import com.github.tartaricacid.unexpectedteleport.client.render.TruckRender;
import com.github.tartaricacid.unexpectedteleport.init.EntityRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientRegister {
    @SubscribeEvent
    public static void onClientSetUpEvent(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityRegistry.TRUCK.get(), TruckRender::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityRegistry.MAGIC_CIRCLE.get(), MagicCircleRender::new);
    }
}
