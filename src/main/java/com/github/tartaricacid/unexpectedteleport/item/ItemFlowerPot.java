package com.github.tartaricacid.unexpectedteleport.item;

import com.github.tartaricacid.unexpectedteleport.init.BlockRegistry;
import com.github.tartaricacid.unexpectedteleport.init.ItemRegistry;
import com.github.tartaricacid.unexpectedteleport.util.TeleportData;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemFlowerPot extends BlockItem {
    public ItemFlowerPot() {
        super(BlockRegistry.FLOWER_POT.get(), new Properties().tab(ItemRegistry.TAB));
        TeleportData.addType("flower_pot", this);
    }

    @Override
    public void fillItemCategory(ItemGroup itemGroup, NonNullList<ItemStack> stacks) {
        if (allowdedIn(itemGroup)) {
            TeleportData.addItemCategory(stacks, this);
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> components, ITooltipFlag tooltipFlag) {
        TeleportData.addHoverText(stack, components);
    }
}
