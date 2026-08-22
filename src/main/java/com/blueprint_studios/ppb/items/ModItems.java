package com.blueprint_studios.ppb.items;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.items.custom.OmniToolItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(PoppyPlaytimeBlueprintMod.MOD_ID);

    public static DeferredItem<OmniToolItem> OMNITOOL = ITEMS.register("omnitool",
            () -> new OmniToolItem((new Item.Properties())));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
