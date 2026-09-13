package com.blueprint_studios.ppb.blocks.entity;

import com.blueprint_studios.ppb.blocks.ModBlockEntities;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class PlaytimeOsBlockEntity extends BlockEntity implements MenuScreens.ScreenConstructor {

    public PlaytimeOsBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.PLAYTIME_OS_BE.get(), pos, blockState);
    }

    @Override
    public Screen create(AbstractContainerMenu menu, Inventory inventory, Component title) {
        return null;
    }
}
