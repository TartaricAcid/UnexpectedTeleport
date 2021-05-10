package com.github.tartaricacid.unexpectedteleport.loot;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.StandaloneLootEntry;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UnexpectedTeleport.MOD_ID)
public class TeleportItemLoot {
    private static final ResourceLocation TELEPORT_ITEM = new ResourceLocation(UnexpectedTeleport.MOD_ID, "teleport_item");

    @SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent event) {
        if (event.getName().getPath().startsWith("chests")) {
            StandaloneLootEntry.Builder<?> tableReference = TableLootEntry.lootTableReference(TELEPORT_ITEM);
            LootPool lootPool = LootPool.lootPool().add(tableReference)
                    .name("teleport_item").build();
            event.getTable().addPool(lootPool);
        }
    }
}
