package com.blueprint_studios.ppb.blocks;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(PoppyPlaytimeBlueprintMod.MOD_ID);


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
