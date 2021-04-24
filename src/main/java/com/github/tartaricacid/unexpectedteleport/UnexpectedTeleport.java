package com.github.tartaricacid.unexpectedteleport;

import com.github.tartaricacid.unexpectedteleport.init.EntityRegistry;
import com.github.tartaricacid.unexpectedteleport.init.ItemRegistry;
import com.github.tartaricacid.unexpectedteleport.init.SoundRegister;
import com.github.tartaricacid.unexpectedteleport.network.NetworkHandler;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport.MOD_ID;

@Mod(MOD_ID)
public class UnexpectedTeleport {
    public static final String MOD_ID = "unexpectedteleport";

    public UnexpectedTeleport() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        EntityRegistry.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        SoundRegister.SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        DeferredWorkQueue.runLater(NetworkHandler::init);
    }
}
