package com.github.tartaricacid.unexpectedteleport.client.event;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class FogEvent {
    private static long TIME = 0;

    @SubscribeEvent
    public static void onRenderEvent(EntityViewRenderEvent.RenderFogEvent event) {
        if (TIME > System.currentTimeMillis()) {
            {
                RenderSystem.fogMode(GlStateManager.FogMode.EXP);
                RenderSystem.fogEnd(event.getFarPlaneDistance());
                RenderSystem.fogStart(1f);
                long interval = TIME - System.currentTimeMillis();
                float density = interval / 5_0000.0f;
                RenderSystem.fogDensity(density);
            }
        }
    }

    public static void setFogTick() {
        TIME = System.currentTimeMillis() + 10 * 1000;
    }
}
