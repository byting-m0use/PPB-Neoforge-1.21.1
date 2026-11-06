package com.blueprint_studios.ppb.common.items;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.common.items.custom.OmniToolItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModIcons {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(PoppyPlaytimeBlueprintMod.MOD_ID);

    public static DeferredItem<Item> BLOCKS_TAB_ICON = ITEMS.register("blocks_tab_icon",
            () -> new Item((new Item.Properties())));

    public static DeferredItem<Item> DECOR_TAB_ICON = ITEMS.register("decor_tab_icon",
            () -> new Item((new Item.Properties())));

    public static DeferredItem<Item> MONSTER_STATUES_TAB_ICON = ITEMS.register("monster_statues_tab_icon",
            () -> new Item((new Item.Properties())));

    public static DeferredItem<Item> MONSTERS_TAB_ICON = ITEMS.register("monsters_tab_icon",
            () -> new Item((new Item.Properties())));

    public static DeferredItem<Item> UTILITY_TAB_ICON = ITEMS.register("utility_tab_icon",
            () -> new Item((new Item.Properties())));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
