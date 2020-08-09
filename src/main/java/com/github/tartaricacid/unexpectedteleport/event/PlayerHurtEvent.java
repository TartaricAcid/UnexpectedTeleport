package com.github.tartaricacid.unexpectedteleport.event;

import com.github.tartaricacid.unexpectedteleport.init.BlockInit;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber()
public final class PlayerHurtEvent {
    @SubscribeEvent
    public static void onPlayerHurt(LivingDamageEvent event) {
        if (event.getSource().getDamageType().equals(DamageSource.FALLING_BLOCK.getDamageType())
                && event.getEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getEntity();
            World world = player.world;
            List<FallingBlockEntity> list = world.getEntitiesWithinAABB(FallingBlockEntity.class, player.getBoundingBox(),
                    e -> e.getBlockState().getBlock() == BlockInit.MAGIC_FLOWERPOT.get());
            if (!list.isEmpty()) {
                player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 10 * 20, 10));
                BlockPos pos = player.getPosition();
                player.teleportKeepLoaded(pos.getX() + world.rand.nextInt(100), 260,
                        pos.getZ() + world.rand.nextInt(100));
            }
        }
    }
}
