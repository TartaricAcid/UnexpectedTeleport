package com.github.tartaricacid.unexpectedteleport.init;

import com.github.tartaricacid.unexpectedteleport.UnexpectedTeleport;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundRegister {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, UnexpectedTeleport.MOD_ID);

    public static RegistryObject<SoundEvent> TRUCK = SOUNDS.register("truck",
            () -> new SoundEvent(new ResourceLocation(UnexpectedTeleport.MOD_ID, "truck")));
}
