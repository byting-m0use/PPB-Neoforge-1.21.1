package com.blueprint_studios.ppb.common.datagen;

import com.blueprint_studios.ppb.common.blocks.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        dropSelf(ModBlocks.WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.YELLOW_WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.RED_WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.BLUE_WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.BASIC_WALLS_WHITE.get());

        dropSelf(ModBlocks.BOOGIE_BOT.get());
        dropSelf(ModBlocks.CANDY_CAT.get());
        dropSelf(ModBlocks.CAT_BEE.get());
        dropSelf(ModBlocks.BRON.get());
        dropSelf(ModBlocks.LIMON.get());
        dropSelf(ModBlocks.PET_STONE.get());

        dropSelf(ModBlocks.BLUE_FENCE_WALL_DECOR.get());

        dropSelf(ModBlocks.PLAYTIME_OS.get());
        dropSelf(ModBlocks.COLOR_CODER.get());
        dropSelf(ModBlocks.BOOGIE_BOT_RED.get());

        dropSelf(ModBlocks.SMALL_CONCRETE_TILES.get());
        dropSelf(ModBlocks.BIG_BRICK_TILES.get());

        dropSelf(ModBlocks.YB_CAUTION_BLOCK.get());
        dropSelf(ModBlocks.BLACK_CARPET.get());
        dropSelf(ModBlocks.BLUE_CARPET.get());
        dropSelf(ModBlocks.RED_CARPET.get());
        dropSelf(ModBlocks.YELLOW_CARPET.get());
        dropSelf(ModBlocks.WINE_RED_CARPET.get());
        dropSelf(ModBlocks.FANCY_BLACK_CARPET.get());
        dropSelf(ModBlocks.FANCY_BLUE_CARPET.get());
        dropSelf(ModBlocks.FANCY_YELLOW_CARPET.get());
        dropSelf(ModBlocks.FANCY_RED_CARPET.get());
        dropSelf(ModBlocks.FANCY_WINE_RED_CARPET.get());
        dropSelf(ModBlocks.PATTERNED_BLACK_CARPET.get());
        dropSelf(ModBlocks.PATTERNED_YELLOW_CARPET.get());
        dropSelf(ModBlocks.WHITE_CONCRETE_TILES.get());
        dropSelf(ModBlocks.RED_CONCRETE_TILES.get());
        dropSelf(ModBlocks.BLUE_CONCRETE_TILES.get());
        dropSelf(ModBlocks.YELLOW_CONCRETE_TILES.get());

        dropSelf(ModBlocks.POPPY_WALLPAPER.get());

        dropSelf(ModBlocks.WHITE_BRICKS.get());
        dropSelf(ModBlocks.WHITE_BRICK_SLAB.get());
        dropSelf(ModBlocks.WHITE_BRICK_STAIRS.get());

        dropSelf(ModBlocks.BLACK_BRICKS.get());
        dropSelf(ModBlocks.BLACK_BRICK_STAIRS.get());
        dropSelf(ModBlocks.BLACK_BRICK_SLAB.get());

        dropSelf(ModBlocks.BLUE_BRICKS.get());
        dropSelf(ModBlocks.BLUE_BRICK_STAIRS.get());
        dropSelf(ModBlocks.BLUE_BRICK_SLAB.get());

        dropSelf(ModBlocks.GREY_BRICKS.get());
        dropSelf(ModBlocks.GREY_BRICK_STAIRS.get());
        dropSelf(ModBlocks.GREY_BRICK_SLAB.get());

        dropSelf(ModBlocks.RED_BRICKS.get());
        dropSelf(ModBlocks.RED_BRICK_STAIRS.get());
        dropSelf(ModBlocks.RED_BRICK_SLAB.get());

        dropSelf(ModBlocks.YELLOW_BRICKS.get());
        dropSelf(ModBlocks.YELLOW_BRICK_SLAB.get());
        dropSelf(ModBlocks.YELLOW_BRICK_STAIRS.get());

        dropSelf(ModBlocks.METAL_BARREL_BLUE.get());
        dropSelf(ModBlocks.METAL_BARREL_YELLOW.get());
        dropSelf(ModBlocks.METAL_BARREL_RED.get());

    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
