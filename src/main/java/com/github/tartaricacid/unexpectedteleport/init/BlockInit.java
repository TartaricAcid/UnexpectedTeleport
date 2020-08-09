package com.github.tartaricacid.unexpectedteleport.init;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import com.github.tartaricacid.unexpectedteleport.block.BlockMagicFlowerpot;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, UnexpectedTeleport.MOD_ID);

    public static RegistryObject<Block> MAGIC_FLOWERPOT = BLOCKS.register("magic_flowerpot", BlockMagicFlowerpot::new);
}
