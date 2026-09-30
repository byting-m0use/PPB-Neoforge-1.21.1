package com.blueprint_studios.ppb.client;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.common.blocks.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = PoppyPlaytimeBlueprintMod.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = PoppyPlaytimeBlueprintMod.MOD_ID, value = Dist.CLIENT)
public class PoppyPlaytimeBlueprintModClient {

    public PoppyPlaytimeBlueprintModClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_FENCE_WALL_DECOR.get(), RenderType.CUTOUT);

    }
}
