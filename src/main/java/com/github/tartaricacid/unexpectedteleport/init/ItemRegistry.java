package com.github.tartaricacid.unexpectedteleport.init;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import com.github.tartaricacid.unexpectedteleport.item.ItemChalk;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnexpectedTeleport.MOD_ID);
    public static ItemGroup TAB = new ItemGroup(UnexpectedTeleport.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return CHALK.get().getDefaultInstance();
        }
    };

    public static RegistryObject<Item> CHALK = ITEMS.register("chalk", ItemChalk::new);
}
