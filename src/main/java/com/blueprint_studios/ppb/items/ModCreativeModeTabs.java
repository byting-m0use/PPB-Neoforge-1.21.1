package com.blueprint_studios.ppb.items;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.blocks.ModBlocks;
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
                            output.accept(ModItems.SOAP);
                            output.accept(ModItems.BUBBA_SOAP);
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
                        output.accept(ModBlocks.PINK_WHITE_FACTORY_TILES);
                        output.accept(ModBlocks.GREEN_WHITE_FACTORY_TILES);
                        output.accept(ModBlocks.PURPLE_WHITE_FACTORY_TILES);
                        output.accept(ModBlocks.LIGHT_BLUE_WHITE_FACTORY_TILES);
                        output.accept(ModBlocks.ORANGE_WHITE_FACTORY_TILES);

                        output.accept(Blocks.BRICKS);
                        output.accept(ModBlocks.HALF_PLASTERED_BRICKS);
                        output.accept(ModBlocks.BIG_VANILLA_BRICKS);
                        output.accept(ModBlocks.SQUARE_VANILLA_BRICKS);
                        output.accept(ModBlocks.DIAGONAL_VANILLA_BRICKS);

                        output.accept(ModBlocks.WHITE_BRICKS);
                        output.accept(ModBlocks.BIG_WHITE_BRICKS);
                        output.accept(ModBlocks.SQUARE_WHITE_BRICKS);
                        output.accept(ModBlocks.DIAGONAL_WHITE_BRICKS);

                        output.accept(ModBlocks.BLACK_BRICKS);
                        output.accept(ModBlocks.BIG_BLACK_BRICKS);
                        output.accept(ModBlocks.SQUARE_BLACK_BRICKS);
                        output.accept(ModBlocks.DIAGONAL_BLACK_BRICKS);

                        output.accept(ModBlocks.PLUSH_BRICKS);
                        output.accept(ModBlocks.BIG_PLUSH_BRICKS);
                        output.accept(ModBlocks.WHITE_RED_BIG_PLUSH_BRICKS);
                        output.accept(ModBlocks.WHITE_BLUE_BIG_PLUSH_BRICKS);
                        output.accept(ModBlocks.WHITE_BLUE_BIG_PLUSH_BRICKS);
                        output.accept(ModBlocks.WHITE_YELLOW_BIG_PLUSH_BRICKS);

                        output.accept(ModBlocks.BLACK_ARCADE_CARPET);

                        output.accept(ModBlocks.BLUE_LARGE_FLOORTILE);
                        output.accept(ModBlocks.RED_LARGE_FLOORTILE);
                        output.accept(ModBlocks.YELLOW_LARGE_FLOORTILE);
                        output.accept(ModBlocks.PINK_LARGE_FLOORTILE);
                        output.accept(ModBlocks.GREEN_LARGE_FLOORTILE);
                        output.accept(ModBlocks.PURPLE_LARGE_FLOORTILE);
                        output.accept(ModBlocks.LIGHT_BLUE_LARGE_FLOORTILE);
                        output.accept(ModBlocks.ORANGE_LARGE_FLOORTILE);
                        output.accept(ModBlocks.WHITE_LARGE_FLOORTILE);
                        output.accept(ModBlocks.SECURITY_OFFICE_FLOORTILE);

                        output.accept(ModBlocks.CONCRETE_FLOORING);

                        output.accept(ModBlocks.GRAY_WOOD_PLANKS);

                        output.accept(ModBlocks.BASIC_WALLS_BLUE);
                        output.accept(ModBlocks.BASIC_WALLS_RED);
                        output.accept(ModBlocks.BASIC_WALLS_TAN);
                        output.accept(ModBlocks.BASIC_WALLS_WHITE);
                        output.accept(ModBlocks.BASIC_WALLS_BLACK);
                        output.accept(ModBlocks.BASIC_WALLS_YELLOW);

                        output.accept(ModBlocks.GIFT_SHOP_WALL_BLUE);
                        output.accept(ModBlocks.GIFT_SHOP_WALL_RED);
                        output.accept(ModBlocks.GIFT_SHOP_WALL_TAN);
                        output.accept(ModBlocks.GIFT_SHOP_WALL_YELLOW);
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

                    }).build());

    public static final Supplier<CreativeModeTab> POPPY_PLAYTIME_FUNCTIONALITY = CREATIVE_MODE_TABS.register("functionality",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.COLOR_CODER.get()))
                    .title(Component.translatable("tabs.ppb.functionality"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.COLOR_CODER);

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
