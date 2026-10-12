package com.blueprint_studios.ppb.common.datagen;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.common.blocks.ModBlocks;
import com.blueprint_studios.ppb.common.util.ModTags;
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

                .add(ModBlocks.WHITE_FACTORY_TILES.get())
                .add(ModBlocks.YELLOW_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.RED_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.BLUE_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.BASIC_WALLS_WHITE.get())
                .add(ModBlocks.BOOGIE_BOT_RED.get())

                .add(ModBlocks.BIG_BRICK_TILES.get())
                .add(ModBlocks.SMALL_BRICK_TILES.get())
                .add(ModBlocks.BIG_CONCRETE_TILES.get())
                .add(ModBlocks.SMALL_CONCRETE_TILES.get())
                .add(ModBlocks.BLACK_GREY_TILES.get())
                .add(ModBlocks.BLACK_WHITE_TILES.get());

        tag(ModTags.Blocks.OMNI_TOOL_INTERACTABLE)
                .add(ModBlocks.YELLOW_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.RED_WHITE_FACTORY_TILES.get())
                .add(ModBlocks.BLUE_WHITE_FACTORY_TILES.get());
    }
}
