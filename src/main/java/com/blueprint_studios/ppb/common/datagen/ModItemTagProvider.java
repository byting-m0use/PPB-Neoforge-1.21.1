package com.blueprint_studios.ppb.common.datagen;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.common.blocks.ModBlocks;
import com.blueprint_studios.ppb.common.items.ModItems;
import com.blueprint_studios.ppb.common.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, PoppyPlaytimeBlueprintMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.SOAP).add(
                ModItems.SOAP.get(),
                ModItems.BUBBA_SOAP.get()
        );

        tag(ModTags.Items.BRICKS).add(
                Items.BRICKS,
                ModBlocks.BLACK_BRICKS.asItem(),
                ModBlocks.WHITE_BRICKS.asItem()
        );

        tag(ModTags.Items.BRICKS_BIG).add(
                ModBlocks.BIG_VANILLA_BRICKS.asItem(),
                ModBlocks.BIG_BLACK_BRICKS.asItem(),
                ModBlocks.BIG_WHITE_BRICKS.asItem()
        );

        tag(ModTags.Items.BRICKS_SQUARE).add(
                ModBlocks.SQUARE_VANILLA_BRICKS.asItem(),
                ModBlocks.SQUARE_BLACK_BRICKS.asItem(),
                ModBlocks.SQUARE_WHITE_BRICKS.asItem()
        );

        tag(ModTags.Items.BRICKS_DIAGONAL).add(
                ModBlocks.DIAGONAL_VANILLA_BRICKS.asItem(),
                ModBlocks.DIAGONAL_BLACK_BRICKS.asItem(),
                ModBlocks.DIAGONAL_WHITE_BRICKS.asItem()
        );

        tag(ModTags.Items.FLOORTILE).add(
                ModBlocks.WHITE_LARGE_FLOORTILE.asItem(),
                ModBlocks.ORANGE_LARGE_FLOORTILE.asItem(),
                ModBlocks.PINK_LARGE_FLOORTILE.asItem(),
                ModBlocks.GREEN_LARGE_FLOORTILE.asItem(),
                ModBlocks.PURPLE_LARGE_FLOORTILE.asItem(),
                ModBlocks.LIGHT_BLUE_LARGE_FLOORTILE.asItem(),
                ModBlocks.RED_LARGE_FLOORTILE.asItem(),
                ModBlocks.YELLOW_LARGE_FLOORTILE.asItem(),
                ModBlocks.BLUE_LARGE_FLOORTILE.asItem()
        );
    }
}
