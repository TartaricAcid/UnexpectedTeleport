package com.github.tartaricacid.unexpectedteleport;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.github.tartaricacid.unexpectedteleport.init.BlockInit.BLOCKS;
import static com.github.tartaricacid.unexpectedteleport.init.ItemInit.ITEMS;

@Mod(UnexpectedTeleport.MOD_ID)
public class UnexpectedTeleport {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "unexpectedteleport";

    public UnexpectedTeleport() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
