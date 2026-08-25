package com.blueprint_studios.ppb.items;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PoppyPlaytimeBlueprintMod.MOD_ID);

    public static final Supplier<CreativeModeTab> POPPY_PLAYTIME_ITEMS = CREATIVE_MODE_TABS.register("items",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.OMNITOOL.get()))
                    .title(Component.translatable("tabs.poppy_playtime_blueprint.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.OMNITOOL);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> POPPY_PLAYTIME_BLOCKS = CREATIVE_MODE_TABS.register("blocks",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.RED_WHITE_FACTORY_TILES.get()))
                    .title(Component.translatable("tabs.poppy_playtime_blueprint.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.WHITE_FACTORY_TILES);
                        output.accept(ModBlocks.RED_WHITE_FACTORY_TILES);
                        output.accept(ModBlocks.BLUE_WHITE_FACTORY_TILES);
                        output.accept(ModBlocks.YELLOW_WHITE_FACTORY_TILES);

                        output.accept(Blocks.BRICKS);
                        output.accept(ModBlocks.BIG_VANILLA_BRICKS);
                        output.accept(ModBlocks.SQUARE_VANILLA_BRICKS);

                        output.accept(ModBlocks.WHITE_BRICKS);
                        output.accept(ModBlocks.BIG_WHITE_BRICKS);
                        output.accept(ModBlocks.SQUARE_WHITE_BRICKS);

                        output.accept(ModBlocks.BLACK_BRICKS);
                        output.accept(ModBlocks.BIG_BLACK_BRICKS);
                        output.accept(ModBlocks.SQUARE_BLACK_BRICKS);

                        output.accept(ModBlocks.PLUSH_BRICKS);
                        output.accept(ModBlocks.BIG_PLUSH_BRICKS);
                        output.accept(ModBlocks.WHITE_RED_BIG_PLUSH_BRICKS);
                        output.accept(ModBlocks.WHITE_BLUE_BIG_PLUSH_BRICKS);
                        output.accept(ModBlocks.WHITE_BLUE_BIG_PLUSH_BRICKS);
                        output.accept(ModBlocks.WHITE_YELLOW_BIG_PLUSH_BRICKS);

                        output.accept(ModBlocks.BLACK_ARCADE_CARPET);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
