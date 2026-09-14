package com.blueprint_studios.ppb.datagen;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.blocks.ModBlocks;
import com.blueprint_studios.ppb.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PoppyPlaytimeBlueprintMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SQUARE_VANILLA_BRICKS.get())
                .add(ModBlocks.BIG_VANILLA_BRICKS.get())
                .add(ModBlocks.DIAGONAL_VANILLA_BRICKS.get())

                .add(ModBlocks.SQUARE_WHITE_BRICKS.get())
                .add(ModBlocks.BIG_WHITE_BRICKS.get())
                .add(ModBlocks.WHITE_BRICKS.get())
                .add(ModBlocks.DIAGONAL_WHITE_BRICKS.get())

                .add(ModBlocks.SQUARE_BLACK_BRICKS.get())
                .add(ModBlocks.BIG_BLACK_BRICKS.get())
                .add(ModBlocks.BLACK_BRICKS.get())
                .add(ModBlocks.DIAGONAL_BLACK_BRICKS.get())

                .add(ModBlocks.PLUSH_BRICKS.get())
                .add(ModBlocks.BIG_PLUSH_BRICKS.get())
                .add(ModBlocks.WHITE_RED_BIG_PLUSH_BRICKS.get())
                .add(ModBlocks.WHITE_BLUE_BIG_PLUSH_BRICKS.get())
                .add(ModBlocks.WHITE_YELLOW_BIG_PLUSH_BRICKS.get())

                .add(ModBlocks.WHITE_FACTORY_TILES.get())
                .add(ModBlocks.YELLOW_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.RED_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.BLUE_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.PINK_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.GREEN_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.LIGHT_BLUE_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.ORANGE_WHITE_FACTORY_TILES.get())

                .add(ModBlocks.RED_LARGE_FLOORTILE.get())
                .add(ModBlocks.WHITE_LARGE_FLOORTILE.get())
                .add(ModBlocks.BLUE_LARGE_FLOORTILE.get())
                .add(ModBlocks.YELLOW_LARGE_FLOORTILE.get())
                .add(ModBlocks.PINK_LARGE_FLOORTILE.get())
                .add(ModBlocks.GREEN_LARGE_FLOORTILE.get())
                .add(ModBlocks.PURPLE_LARGE_FLOORTILE.get())
                .add(ModBlocks.LIGHT_BLUE_LARGE_FLOORTILE.get())
                .add(ModBlocks.ORANGE_LARGE_FLOORTILE.get())
                .add(ModBlocks.SECURITY_OFFICE_FLOORTILE.get())

                .add(ModBlocks.CONCRETE_FLOORING.get())

                .add(ModBlocks.GRAY_WOOD_PLANKS.get())

                .add(ModBlocks.BASIC_WALLS_BLUE.get())
                .add(ModBlocks.BASIC_WALLS_BLACK.get())
                .add(ModBlocks.BASIC_WALLS_RED.get())
                .add(ModBlocks.BASIC_WALLS_WHITE.get())
                .add(ModBlocks.BASIC_WALLS_YELLOW.get())
                .add(ModBlocks.BASIC_WALLS_TAN.get())

                .add(ModBlocks.GIFT_SHOP_WALL_BLUE.get())
                .add(ModBlocks.GIFT_SHOP_WALL_RED.get())
                .add(ModBlocks.GIFT_SHOP_WALL_TAN.get())
                .add(ModBlocks.GIFT_SHOP_WALL_YELLOW.get());

        tag(BlockTags.OCCLUDES_VIBRATION_SIGNALS)
                .add(ModBlocks.BLACK_ARCADE_CARPET.get());

        tag(BlockTags.DAMPENS_VIBRATIONS)
                .add(ModBlocks.BLACK_ARCADE_CARPET.get());

        tag(BlockTags.WOOL)
                .add(ModBlocks.BLACK_ARCADE_CARPET.get());

        tag(ModTags.Blocks.OMNI_TOOL_INTERACTABLE)
                .add(ModBlocks.YELLOW_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.RED_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.PINK_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.BLUE_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.PURPLE_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.LIGHT_BLUE_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.ORANGE_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.GREEN_WHITE_FACTORY_TILES.get());
    }
}
