package com.blueprint_studios.ppb.common.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public interface WrenchInteractable {
    void wrenchInteract(Level level, BlockPos pos, BlockState state);
}
