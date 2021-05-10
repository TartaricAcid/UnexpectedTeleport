package com.github.tartaricacid.unexpectedteleport.event;

import com.github.tartaricacid.unexpectedteleport.init.BlockRegistry;
import com.github.tartaricacid.unexpectedteleport.tileentity.TileEntityFlowerPot;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber()
public class FlowerPotDamageEvent {
    @SubscribeEvent
    public static void onEntityHurt(LivingDamageEvent event) {
        if (event.getSource().getMsgId().equals(DamageSource.FALLING_BLOCK.getMsgId())
                && event.getEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getEntity();
            World world = player.level;
            List<FallingBlockEntity> list = world.getEntitiesOfClass(FallingBlockEntity.class, player.getBoundingBox(),
                    e -> e.getBlockState().getBlock() == BlockRegistry.FLOWER_POT.get());
            if (!list.isEmpty()) {
                FallingBlockEntity entity = list.get(0);
                CompoundNBT nbt = entity.blockData;
                if (nbt != null && nbt.contains("ForgeData", Constants.NBT.TAG_COMPOUND)) {
                    CompoundNBT forgeNbt = nbt.getCompound("ForgeData");
                    String dim = forgeNbt.getString(TileEntityFlowerPot.DIM_TAG_NAME);
                    String feature = forgeNbt.getString(TileEntityFlowerPot.FEATURE_TAG_NAME);
                    BlockPos pos = NBTUtil.readBlockPos(forgeNbt.getCompound(TileEntityFlowerPot.POS_TAG_NAME));
                    ScheduledTeleportEvent.TeleportInfo info = new ScheduledTeleportEvent.TeleportInfo(dim, feature, pos);
                    ScheduledTeleportEvent.addScheduledTeleport(player.getUUID(), info);
                }
            }
        }
    }
}
