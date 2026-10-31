package com.blueprint_studios.ppb.common.items;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.common.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
                    .title(Component.translatable("tabs.ppb.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.OMNITOOL);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> POPPY_PLAYTIME_BLOCKS = CREATIVE_MODE_TABS.register("blocks",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.RED_WHITE_FACTORY_TILES.get()))
                    .title(Component.translatable("tabs.ppb.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.WHITE_FACTORY_TILES);
                        output.accept(ModBlocks.RED_WHITE_FACTORY_TILES);
                        output.accept(ModBlocks.BLUE_WHITE_FACTORY_TILES);
                        output.accept(ModBlocks.YELLOW_WHITE_FACTORY_TILES);

                        output.accept(ModBlocks.BASIC_WALLS_WHITE);

                        output.accept(Blocks.BRICKS);

                        output.accept(ModBlocks.BIG_BRICK_TILES);
                        output.accept(ModBlocks.SMALL_BRICK_TILES);
                        output.accept(ModBlocks.SMALL_CONCRETE_TILES);
                        output.accept(ModBlocks.BIG_CONCRETE_TILES);
                        output.accept(ModBlocks.BLACK_GREY_TILES);
                        output.accept(ModBlocks.BLACK_WHITE_TILES);

                        output.accept(ModBlocks.WHITE_CONCRETE_TILES);
                        output.accept(ModBlocks.RED_CONCRETE_TILES);
                        output.accept(ModBlocks.BLUE_CONCRETE_TILES);
                        output.accept(ModBlocks.YELLOW_CONCRETE_TILES);

                        output.accept(ModBlocks.BLACK_CARPET);
                        output.accept(ModBlocks.FANCY_BLACK_CARPET);
                        output.accept(ModBlocks.PATTERNED_BLACK_CARPET);

                        output.accept(ModBlocks.BLUE_CARPET);
                        output.accept(ModBlocks.FANCY_BLUE_CARPET);
                        output.accept(ModBlocks.RED_CARPET);
                        output.accept(ModBlocks.FANCY_RED_CARPET);
                        output.accept(ModBlocks.WINE_RED_CARPET);
                        output.accept(ModBlocks.FANCY_WINE_RED_CARPET);
                        output.accept(ModBlocks.YELLOW_CARPET);

                        output.accept(ModBlocks.FANCY_YELLOW_CARPET);
                        output.accept(ModBlocks.PATTERNED_YELLOW_CARPET);

                        output.accept(ModBlocks.YB_CAUTION_BLOCK);

                        output.accept(ModBlocks.WHITE_BRICKS);
                        output.accept(ModBlocks.WHITE_BRICK_STAIRS);
                        output.accept(ModBlocks.WHITE_BRICK_SLAB);

                        output.accept(ModBlocks.GREY_BRICKS);
                        output.accept(ModBlocks.GREY_BRICK_STAIRS);
                        output.accept(ModBlocks.GREY_BRICK_SLAB);

                        output.accept(ModBlocks.BLACK_BRICKS);
                        output.accept(ModBlocks.BLACK_BRICK_STAIRS);
                        output.accept(ModBlocks.BLACK_BRICK_SLAB);

                        output.accept(ModBlocks.BLUE_BRICKS);
                        output.accept(ModBlocks.BLUE_BRICK_STAIRS);
                        output.accept(ModBlocks.BLUE_BRICK_SLAB);

                        output.accept(ModBlocks.RED_BRICKS);
                        output.accept(ModBlocks.RED_BRICK_STAIRS);
                        output.accept(ModBlocks.RED_BRICK_SLAB);

                        output.accept(ModBlocks.YELLOW_BRICKS);
                        output.accept(ModBlocks.YELLOW_BRICK_STAIRS);
                        output.accept(ModBlocks.YELLOW_BRICK_SLAB);

                    })
                    .build());

    public static final Supplier<CreativeModeTab> POPPY_PLAYTIME_TOYS = CREATIVE_MODE_TABS.register("toys",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.CANDY_CAT.get()))
                    .title(Component.translatable("tabs.ppb.toys"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BOOGIE_BOT);
                        output.accept(ModBlocks.BOOGIE_BOT_RED);
                        output.accept(ModBlocks.CANDY_CAT);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> POPPY_PLAYTIME_DECOR = CREATIVE_MODE_TABS.register("decor",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BLUE_FENCE_WALL_DECOR.get()))
                    .title(Component.translatable("tabs.ppb.decor"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLUE_FENCE_WALL_DECOR);
                        output.accept(ModBlocks.METAL_BARREL_BLUE);
                        output.accept(ModBlocks.METAL_BARREL_RED);
                        output.accept(ModBlocks.METAL_BARREL_YELLOW);

                    }).build());

    public static final Supplier<CreativeModeTab> POPPY_PLAYTIME_FUNCTIONALITY = CREATIVE_MODE_TABS.register("functionality",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.COLOR_CODER.get()))
                    .title(Component.translatable("tabs.ppb.functionality"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.COLOR_CODER);

                    }).build());

    public static final Supplier<CreativeModeTab> POPPY_PLAYTIME_STATUES = CREATIVE_MODE_TABS.register("statues",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.HUGGY_STATUE.get()))
                    .title(Component.translatable("tabs.ppb.statues"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HUGGY_STATUE);

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
