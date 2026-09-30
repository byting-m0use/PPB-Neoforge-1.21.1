package com.blueprint_studios.ppb.common.items;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.common.items.custom.OmniToolItem;
import com.blueprint_studios.ppb.common.items.custom.SoapItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(PoppyPlaytimeBlueprintMod.MOD_ID);

    public static DeferredItem<OmniToolItem> OMNITOOL = ITEMS.register("omnitool",
            () -> new OmniToolItem((new Item.Properties())));

    public static DeferredItem<SoapItem> SOAP = ITEMS.register("soap",
            () -> new SoapItem(new Item.Properties(), 64));

    public static DeferredItem<SoapItem> BUBBA_SOAP = ITEMS.register("bubba_soap",
            () -> new SoapItem(new Item.Properties(), 256));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
