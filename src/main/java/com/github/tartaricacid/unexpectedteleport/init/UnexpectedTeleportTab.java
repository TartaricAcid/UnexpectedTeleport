package com.github.tartaricacid.unexpectedteleport.init;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class UnexpectedTeleportTab extends ItemGroup {
    public UnexpectedTeleportTab() {
        super(UnexpectedTeleport.MOD_ID);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.MAGIC_FLOWERPOT.get());
    }
}
