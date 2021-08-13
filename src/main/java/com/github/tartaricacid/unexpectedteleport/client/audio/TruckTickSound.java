package com.github.tartaricacid.unexpectedteleport.client.audio;

import com.github.tartaricacid.unexpectedteleport.entity.EntityTruck;
import com.github.tartaricacid.unexpectedteleport.init.SoundRegistry;
import net.minecraft.client.audio.TickableSound;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TruckTickSound extends TickableSound {
    private final EntityTruck entityTruck;

    public TruckTickSound(EntityTruck entityTruck) {
        super(SoundRegistry.TRUCK.get(), SoundCategory.NEUTRAL);
        this.entityTruck = entityTruck;
        this.delay = 0;
        this.x = (float) entityTruck.getX();
        this.y = (float) entityTruck.getY();
        this.z = (float) entityTruck.getZ();
        this.volume = 0.3f;
    }

    @Override
    public boolean canStartSilent() {
        return entityTruck.isSilent();
    }

    @Override
    public boolean canPlaySound() {
        return true;
    }

    @Override
    public void tick() {
        if (!entityTruck.isAlive()) {
            this.stop();
        } else {
            this.x = entityTruck.getX();
            this.y = entityTruck.getY();
            this.z = entityTruck.getZ();
        }
    }
}
