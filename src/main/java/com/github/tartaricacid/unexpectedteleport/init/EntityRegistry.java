package com.github.tartaricacid.unexpectedteleport.init;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import com.github.tartaricacid.unexpectedteleport.entity.EntityMagicCircle;
import com.github.tartaricacid.unexpectedteleport.entity.EntityTruck;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, UnexpectedTeleport.MOD_ID);

    public static RegistryObject<EntityType<EntityTruck>> TRUCK = ENTITY_TYPES.register("truck",
            () -> EntityTruck.TYPE);
    public static RegistryObject<EntityType<EntityMagicCircle>> MAGIC_CIRCLE = ENTITY_TYPES.register("magic_circle",
            () -> EntityMagicCircle.TYPE);

    @SubscribeEvent
    public static void addEntityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(EntityTruck.TYPE, AttributeModifierMap.builder()
                .add(Attributes.MAX_HEALTH, 24.0f)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0.0f)
                .add(Attributes.MOVEMENT_SPEED, 1.0f)
                .add(ForgeMod.ENTITY_GRAVITY.get(), 1.0f)
                .build());
    }
}
