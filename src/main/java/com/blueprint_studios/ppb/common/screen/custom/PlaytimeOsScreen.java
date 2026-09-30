package com.blueprint_studios.ppb.common.screen.custom;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class PlaytimeOsScreen extends Screen {
    private static final ResourceLocation GUI_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(PoppyPlaytimeBlueprintMod.MOD_ID,"textures/gui/playtime_os/artifact_binding_table_gui.png");

    protected PlaytimeOsScreen(Component title) {
        super(title);
    }
}
