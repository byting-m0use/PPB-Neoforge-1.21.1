package com.blueprint_studios.ppb.screen.custom;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

public class PlaytimeOsScreen extends Screen {
    private static final ResourceLocation GUI_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(PoppyPlaytimeBlueprintMod.MOD_ID,"textures/gui/playtime_os/artifact_binding_table_gui.png");

    protected PlaytimeOsScreen(Component title) {
        super(title);
    }
}
