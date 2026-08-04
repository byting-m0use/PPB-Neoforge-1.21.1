package com.blueprint_studios.ppb.items;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(PoppyPlaytimeBlueprintMod.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
