package com.github.tartaricacid.unexpectedteleport.init;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, UnexpectedTeleport.MOD_ID);
    public static final ItemGroup TAB = new UnexpectedTeleportTab();

    public static RegistryObject<Item> MAGIC_FLOWERPOT = ITEMS.register("magic_flowerpot",
            () -> new BlockItem(BlockInit.MAGIC_FLOWERPOT.get(), new Item.Properties().group(TAB)));
}
