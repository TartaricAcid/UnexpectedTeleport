package com.github.tartaricacid.unexpectedteleport.init;

import com.github.tartaricacid.unexpectedteleport.command.GetChalk;
import com.github.tartaricacid.unexpectedteleport.command.GetFlowerPot;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class CommandRegistry {
    @SubscribeEvent
    public static void onServerStaring(RegisterCommandsEvent event) {
        GetChalk.register(event.getDispatcher());
        GetFlowerPot.register(event.getDispatcher());
    }
}
