package com.github.tartaricacid.unexpectedteleport;

import com.github.tartaricacid.unexpectedteleport.command.TeleportTypeArgument;
import com.github.tartaricacid.unexpectedteleport.init.*;
import com.github.tartaricacid.unexpectedteleport.network.NetworkHandler;
import net.minecraft.command.arguments.ArgumentSerializer;
import net.minecraft.command.arguments.ArgumentTypes;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport.MOD_ID;

@Mod(MOD_ID)
public class UnexpectedTeleport {
    public static final String MOD_ID = "unexpectedteleport";

    public UnexpectedTeleport() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TileEntityRegistry.TILE_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        EntityRegistry.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        SoundRegistry.SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        DeferredWorkQueue.runLater(NetworkHandler::init);
    }

    public void commonSetup(FMLCommonSetupEvent event) {
        ArgumentTypes.register("unexpectedteleport:teleport", TeleportTypeArgument.class,
                new ArgumentSerializer<>(TeleportTypeArgument::type));
    }
}
