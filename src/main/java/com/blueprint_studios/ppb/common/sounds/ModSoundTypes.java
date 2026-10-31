package com.blueprint_studios.ppb.common.sounds;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.neoforge.common.util.DeferredSoundType;

public class ModSoundTypes {
    public static final SoundType LIMON_SOUNDS = new DeferredSoundType(
            1.0f,
            1.25f,
            ModSounds.LIMON,
            () -> SoundEvents.STONE_STEP,
            ModSounds.LIMON,
            () -> SoundEvents.STONE_HIT,
            () -> SoundEvents.STONE_FALL
    );
}
