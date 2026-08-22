package com.blueprint_studios.ppb.blocks;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.blocks.custom.FactoryTilesBlock;
import com.blueprint_studios.ppb.items.ModItems;
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
    
   public static DeferredBlock<Block> SQUARE_WHITE_BRICKS = registerBlock("square_white_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> BIG_WHITE_BRICKS = registerBlock("big_white_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> WHITE_BRICKS = registerBlock("white_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> SQUARE_BLACK_BRICKS = registerBlock("square_black_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> BIG_BLACK_BRICKS = registerBlock("big_black_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> BLACK_BRICKS = registerBlock("black_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<Block> PLUSH_BRICKS = registerBlock("plush_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOL)));
    
   public static DeferredBlock<Block> BIG_PLUSH_BRICKS = registerBlock("big_plush_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOL)));
    
   public static DeferredBlock<Block> WHITE_RED_BIG_PLUSH_BRICKS = registerBlock("white_red_big_plush_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOL)));
    
   public static DeferredBlock<Block> WHITE_BLUE_BIG_PLUSH_BRICKS = registerBlock("white_blue_big_plush_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOL)));
    
   public static DeferredBlock<Block> WHITE_FACTORY_TILES = registerBlock("white_factory_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> YELLOW_WHITE_FACTORY_TILES = registerBlock("yellow_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> RED_WHITE_FACTORY_TILES = registerBlock("red_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> BLUE_WHITE_FACTORY_TILES = registerBlock("blue_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

   public static DeferredBlock<Block> BLACK_ARCADE_CARPET = registerBlock("black_arcade_carpet",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));

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