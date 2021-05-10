package com.github.tartaricacid.unexpectedteleport.init;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import com.github.tartaricacid.unexpectedteleport.tileentity.TileEntityFlowerPot;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, UnexpectedTeleport.MOD_ID);
    public static RegistryObject<TileEntityType<TileEntityFlowerPot>> FLOWER_POT = TILE_ENTITIES.register("flower_pot",
            () -> TileEntityType.Builder.of(TileEntityFlowerPot::new, BlockRegistry.FLOWER_POT.get()).build(null));
}
