package com.blueprint_studios.ppb.datagen;

import com.blueprint_studios.ppb.blocks.ModBlocks;
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
import net.neoforged.fml.common.Mod;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.SQUARE_VANILLA_BRICKS.get());
        dropSelf(ModBlocks.BIG_VANILLA_BRICKS.get());
        dropSelf(ModBlocks.DIAGONAL_VANILLA_BRICKS.get());

        dropSelf(ModBlocks.SQUARE_WHITE_BRICKS.get());
        dropSelf(ModBlocks.BIG_WHITE_BRICKS.get());
        dropSelf(ModBlocks.WHITE_BRICKS.get());
        dropSelf(ModBlocks.DIAGONAL_WHITE_BRICKS.get());

        dropSelf(ModBlocks.SQUARE_BLACK_BRICKS.get());
        dropSelf(ModBlocks.BIG_BLACK_BRICKS.get());
        dropSelf(ModBlocks.BLACK_BRICKS.get());
        dropSelf(ModBlocks.DIAGONAL_BLACK_BRICKS.get());

        dropSelf(ModBlocks.PLUSH_BRICKS.get());
        dropSelf(ModBlocks.BIG_PLUSH_BRICKS.get());
        dropSelf(ModBlocks.WHITE_RED_BIG_PLUSH_BRICKS.get());
        dropSelf(ModBlocks.WHITE_BLUE_BIG_PLUSH_BRICKS.get());
        dropSelf(ModBlocks.WHITE_YELLOW_BIG_PLUSH_BRICKS.get());

        dropSelf(ModBlocks.WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.YELLOW_WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.RED_WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.BLUE_WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.PINK_WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.GREEN_WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.PURPLE_WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WHITE_FACTORY_TILES.get());
        dropSelf(ModBlocks.ORANGE_WHITE_FACTORY_TILES.get());

        dropSelf(ModBlocks.BLACK_ARCADE_CARPET.get());

        dropSelf(ModBlocks.WHITE_LARGE_FLOORTILE.get());
        dropSelf(ModBlocks.BLUE_LARGE_FLOORTILE.get());
        dropSelf(ModBlocks.YELLOW_LARGE_FLOORTILE.get());
        dropSelf(ModBlocks.RED_LARGE_FLOORTILE.get());
        dropSelf(ModBlocks.PINK_LARGE_FLOORTILE.get());
        dropSelf(ModBlocks.GREEN_LARGE_FLOORTILE.get());
        dropSelf(ModBlocks.PURPLE_LARGE_FLOORTILE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_LARGE_FLOORTILE.get());
        dropSelf(ModBlocks.ORANGE_LARGE_FLOORTILE.get());
        dropSelf(ModBlocks.SECURITY_OFFICE_FLOORTILE.get());

        dropSelf(ModBlocks.GRAY_WOOD_PLANKS.get());

        dropSelf(ModBlocks.CONCRETE_FLOORING.get());

        dropSelf(ModBlocks.BASIC_WALLS_BLACK.get());
        dropSelf(ModBlocks.BASIC_WALLS_BLUE.get());
        dropSelf(ModBlocks.BASIC_WALLS_RED.get());
        dropSelf(ModBlocks.BASIC_WALLS_TAN.get());
        dropSelf(ModBlocks.BASIC_WALLS_WHITE.get());
        dropSelf(ModBlocks.BASIC_WALLS_YELLOW.get());

        dropSelf(ModBlocks.GIFT_SHOP_WALL_TAN.get());
        dropSelf(ModBlocks.GIFT_SHOP_WALL_RED.get());
        dropSelf(ModBlocks.GIFT_SHOP_WALL_BLUE.get());
        dropSelf(ModBlocks.GIFT_SHOP_WALL_YELLOW.get());

        dropSelf(ModBlocks.BOOGIE_BOT.get());
        dropSelf(ModBlocks.CANDY_CAT.get());

        dropSelf(ModBlocks.BLUE_FENCE_WALL_DECOR.get());

        dropSelf(ModBlocks.PLAYTIME_OS.get());

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
