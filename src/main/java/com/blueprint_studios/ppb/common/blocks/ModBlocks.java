package com.blueprint_studios.ppb.common.blocks;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.common.blocks.custom.*;
import com.blueprint_studios.ppb.common.blocks.custom.decor.BlueFenceWallDecorBlock;
import com.blueprint_studios.ppb.common.blocks.custom.decor.MetalBarrel;
import com.blueprint_studios.ppb.common.blocks.custom.functionality.ColorCoderBlock;
import com.blueprint_studios.ppb.common.blocks.custom.functionality.PlaytimeOsBlock;
import com.blueprint_studios.ppb.common.blocks.custom.statue.HuggyWuggyStatue;
import com.blueprint_studios.ppb.common.blocks.custom.toys.*;
import com.blueprint_studios.ppb.common.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(PoppyPlaytimeBlueprintMod.MOD_ID);

    public static DeferredBlock<Block> WHITE_FACTORY_TILES = registerBlock("white_factory_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> YELLOW_WHITE_FACTORY_TILES = registerBlock("yellow_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> RED_WHITE_FACTORY_TILES = registerBlock("red_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> BLUE_WHITE_FACTORY_TILES = registerBlock("blue_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> BLUE_FENCE_WALL_DECOR = registerBlock("blue_fence_wall_decor",
            () -> new BlueFenceWallDecorBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> PLAYTIME_OS = registerBlock("playtime_os",
            () -> new PlaytimeOsBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> BASIC_WALLS_WHITE = registerBlock("basic_walls_white",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> COLOR_CODER = registerBlock("color_coder",
            () -> new ColorCoderBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> BIG_CONCRETE_TILES = registerBlock("big_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> SMALL_CONCRETE_TILES = registerBlock("small_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> BLACK_WHITE_TILES = registerBlock("black_white_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> BLACK_GREY_TILES = registerBlock("black_grey_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> SMALL_BRICK_TILES = registerBlock("small_brick_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> BIG_BRICK_TILES = registerBlock("big_brick_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> BLACK_CARPET = registerBlock("black_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));

    public static DeferredBlock<Block> BLUE_CARPET = registerBlock("blue_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));

    public static DeferredBlock<Block> RED_CARPET = registerBlock("red_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL)));

    public static DeferredBlock<Block> WINE_RED_CARPET = registerBlock("wine_red_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL)));

    public static DeferredBlock<Block> YELLOW_CARPET = registerBlock("yellow_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL)));

    public static DeferredBlock<Block> FANCY_BLACK_CARPET = registerBlock("fancy_black_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));

    public static DeferredBlock<Block> FANCY_BLUE_CARPET = registerBlock("fancy_blue_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));

    public static DeferredBlock<Block> FANCY_RED_CARPET = registerBlock("fancy_red_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL)));

    public static DeferredBlock<Block> FANCY_WINE_RED_CARPET = registerBlock("fancy_wine_red_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL)));

    public static DeferredBlock<Block> FANCY_YELLOW_CARPET = registerBlock("fancy_yellow_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));

    public static DeferredBlock<Block> PATTERNED_BLACK_CARPET = registerBlock("patterned_black_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));

    public static DeferredBlock<Block> PATTERNED_YELLOW_CARPET = registerBlock("patterned_yellow_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL)));

    public static DeferredBlock<Block> WHITE_CONCRETE_TILES = registerBlock("white_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> YELLOW_CONCRETE_TILES = registerBlock("yellow_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> RED_CONCRETE_TILES = registerBlock("red_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> BLUE_CONCRETE_TILES = registerBlock("blue_concrete_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> YB_CAUTION_BLOCK = registerBlock("yb_caution_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> POPPY_WALLPAPER = registerBlock("poppy_wallpaper",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL)));

    //BRICKS
    public static DeferredBlock<Block> WHITE_BRICKS = registerBlock("white_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> RED_BRICKS = registerBlock("red_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> YELLOW_BRICKS = registerBlock("yellow_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> GREY_BRICKS = registerBlock("grey_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> BLUE_BRICKS = registerBlock("blue_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> BLACK_BRICKS = registerBlock("black_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    //STAIRS & SLABS
    public static DeferredBlock<StairBlock> BLACK_BRICK_STAIRS = registerBlock("black_brick_stairs",
            () -> new StairBlock(ModBlocks.BLACK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<SlabBlock> BLACK_BRICK_SLAB = registerBlock("black_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<StairBlock> BLUE_BRICK_STAIRS = registerBlock("blue_brick_stairs",
            () -> new StairBlock(ModBlocks.BLUE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<SlabBlock> BLUE_BRICK_SLAB = registerBlock("blue_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<StairBlock> RED_BRICK_STAIRS = registerBlock("red_brick_stairs",
            () -> new StairBlock(ModBlocks.RED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<SlabBlock> RED_BRICK_SLAB = registerBlock("red_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<StairBlock> WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            () -> new StairBlock(ModBlocks.WHITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<SlabBlock> WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<StairBlock> YELLOW_BRICK_STAIRS = registerBlock("yellow_brick_stairs",
            () -> new StairBlock(ModBlocks.YELLOW_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<SlabBlock> YELLOW_BRICK_SLAB = registerBlock("yellow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<StairBlock> GREY_BRICK_STAIRS = registerBlock("grey_brick_stairs",
            () -> new StairBlock(ModBlocks.GREY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static DeferredBlock<SlabBlock> GREY_BRICK_SLAB = registerBlock("grey_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //STATUES
    public static DeferredBlock<Block> HUGGY_STATUE = registerBlock("huggy_statue",
            () -> new HuggyWuggyStatue(BlockBehaviour.Properties.of().noOcclusion().noLootTable()));

    //DECOR
    public static DeferredBlock<Block> METAL_BARREL_BLUE = registerBlock("metal_barrel_blue",
            () -> new MetalBarrel(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> METAL_BARREL_RED = registerBlock("metal_barrel_red",
            () -> new MetalBarrel(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> METAL_BARREL_YELLOW = registerBlock("metal_barrel_yellow",
            () -> new MetalBarrel(BlockBehaviour.Properties.of().noOcclusion()));

    //TOYS
    public static DeferredBlock<Block> BOOGIE_BOT = registerBlock("boogie_bot",
            () -> new BoogieBotBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> BOOGIE_BOT_RED = registerBlock("boogie_bot_red",
            () -> new BoogieBotBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> CANDY_CAT = registerBlock("candy_cat",
            () -> new CandyCatBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> CAT_BEE = registerBlock("cat_bee",
            () -> new CatBeeBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> BRON = registerBlock("bron",
            () -> new CatBeeBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> LIMON = registerBlock("limon",
            () -> new LimonBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> PET_STONE = registerBlock("pet_stone",
            () -> new PetStoneBlock(BlockBehaviour.Properties.of().noOcclusion()));

   private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
   }

   private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
   }


   public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
   }
}