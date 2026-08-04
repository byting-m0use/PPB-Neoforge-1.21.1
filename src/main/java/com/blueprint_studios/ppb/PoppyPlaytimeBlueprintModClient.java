package com.blueprint_studios.ppb;

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

    }
}
