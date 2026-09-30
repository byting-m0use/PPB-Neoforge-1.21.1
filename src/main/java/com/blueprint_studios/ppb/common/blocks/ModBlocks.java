package com.blueprint_studios.ppb.common.blocks;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.common.blocks.custom.*;
import com.blueprint_studios.ppb.common.blocks.custom.decor.BlueFenceWallDecorBlock;
import com.blueprint_studios.ppb.common.blocks.custom.functionality.ColorCoderBlock;
import com.blueprint_studios.ppb.common.blocks.custom.functionality.PlaytimeOsBlock;
import com.blueprint_studios.ppb.common.blocks.custom.toys.BoogieBotBlock;
import com.blueprint_studios.ppb.common.blocks.custom.toys.CandyCatBlock;
import com.blueprint_studios.ppb.common.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(PoppyPlaytimeBlueprintMod.MOD_ID);
    
   public static DeferredBlock<Block> SQUARE_VANILLA_BRICKS = registerBlock("square_bricks",
           () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> BIG_VANILLA_BRICKS = registerBlock("big_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> DIAGONAL_VANILLA_BRICKS = registerBlock("diagonal_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> SQUARE_WHITE_BRICKS = registerBlock("square_white_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> BIG_WHITE_BRICKS = registerBlock("big_white_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> WHITE_BRICKS = registerBlock("white_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> DIAGONAL_WHITE_BRICKS = registerBlock("diagonal_white_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> SQUARE_BLACK_BRICKS = registerBlock("square_black_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> BIG_BLACK_BRICKS = registerBlock("big_black_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> BLACK_BRICKS = registerBlock("black_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> DIAGONAL_BLACK_BRICKS = registerBlock("diagonal_black_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> PLUSH_BRICKS = registerBlock("plush_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOL)));
    
   public static DeferredBlock<Block> BIG_PLUSH_BRICKS = registerBlock("big_plush_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOL)));
    
   public static DeferredBlock<Block> WHITE_RED_BIG_PLUSH_BRICKS = registerBlock("white_red_big_plush_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOL)));
    
   public static DeferredBlock<Block> WHITE_BLUE_BIG_PLUSH_BRICKS = registerBlock("white_blue_big_plush_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOL)));

   public static DeferredBlock<Block> WHITE_YELLOW_BIG_PLUSH_BRICKS = registerBlock("white_yellow_big_plush_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOL)));

    public static DeferredBlock<Block> WHITE_FACTORY_TILES = registerBlock("white_factory_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> YELLOW_WHITE_FACTORY_TILES = registerBlock("yellow_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> RED_WHITE_FACTORY_TILES = registerBlock("red_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> BLUE_WHITE_FACTORY_TILES = registerBlock("blue_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<FactoryTilesBlock> PINK_WHITE_FACTORY_TILES = registerBlock("pink_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<FactoryTilesBlock> GREEN_WHITE_FACTORY_TILES = registerBlock("green_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<FactoryTilesBlock> PURPLE_WHITE_FACTORY_TILES = registerBlock("purple_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<FactoryTilesBlock> LIGHT_BLUE_WHITE_FACTORY_TILES = registerBlock("light_blue_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<FactoryTilesBlock> ORANGE_WHITE_FACTORY_TILES = registerBlock("orange_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

   public static DeferredBlock<Block> BLACK_ARCADE_CARPET = registerBlock("black_arcade_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));

    public static DeferredBlock<Block> WHITE_LARGE_FLOORTILE = registerBlock("white_large_floortile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> RED_LARGE_FLOORTILE = registerBlock("red_large_floortile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> YELLOW_LARGE_FLOORTILE = registerBlock("yellow_large_floortile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> BLUE_LARGE_FLOORTILE = registerBlock("blue_large_floortile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> PINK_LARGE_FLOORTILE = registerBlock("pink_large_floortile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> GREEN_LARGE_FLOORTILE = registerBlock("green_large_floortile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> PURPLE_LARGE_FLOORTILE = registerBlock("purple_large_floortile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> LIGHT_BLUE_LARGE_FLOORTILE = registerBlock("light_blue_large_floortile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> ORANGE_LARGE_FLOORTILE = registerBlock("orange_large_floortile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> SECURITY_OFFICE_FLOORTILE = registerBlock("security_office_floortile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> CONCRETE_FLOORING = registerBlock("concrete_flooring",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> GRAY_WOOD_PLANKS = registerBlock("gray_wood_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    public static DeferredBlock<Block> BOOGIE_BOT = registerBlock("boogie_bot",
            () -> new BoogieBotBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> BOOGIE_BOT_RED = registerBlock("boogie_bot_red",
            () -> new BoogieBotBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> CANDY_CAT = registerBlock("candy_cat",
            () -> new CandyCatBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> BLUE_FENCE_WALL_DECOR = registerBlock("blue_fence_wall_decor",
            () -> new BlueFenceWallDecorBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> PLAYTIME_OS = registerBlock("playtime_os",
            () -> new PlaytimeOsBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static DeferredBlock<Block> BASIC_WALLS_BLACK = registerBlock("basic_walls_black",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> BASIC_WALLS_BLUE = registerBlock("basic_walls_blue",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> BASIC_WALLS_RED = registerBlock("basic_walls_red",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> BASIC_WALLS_TAN = registerBlock("basic_walls_tan",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> BASIC_WALLS_WHITE = registerBlock("basic_walls_white",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> BASIC_WALLS_YELLOW = registerBlock("basic_walls_yellow",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> GIFT_SHOP_WALL_BLUE = registerBlock("gift_shop_wall_blue",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> GIFT_SHOP_WALL_RED = registerBlock("gift_shop_wall_red",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> GIFT_SHOP_WALL_TAN = registerBlock("gift_shop_wall_tan",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> GIFT_SHOP_WALL_YELLOW = registerBlock("gift_shop_wall_yellow",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static DeferredBlock<Block> HALF_PLASTERED_BRICKS = registerBlock("half_plastered_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static DeferredBlock<Block> COLOR_CODER = registerBlock("color_coder",
            () -> new ColorCoderBlock(BlockBehaviour.Properties.of().noOcclusion()));

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