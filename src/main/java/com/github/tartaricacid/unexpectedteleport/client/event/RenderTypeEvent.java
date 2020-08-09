package com.github.tartaricacid.unexpectedteleport.client.event;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import com.github.tartaricacid.unexpectedteleport.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT, modid = UnexpectedTeleport.MOD_ID)
public final class RenderTypeEvent {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.MAGIC_FLOWERPOT.get(), RenderType.getCutout());
    }
}
