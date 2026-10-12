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

    public static DeferredBlock<Block> WHITE_FACTORY_TILES = registerBlock("white_factory_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> YELLOW_WHITE_FACTORY_TILES = registerBlock("yellow_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> RED_WHITE_FACTORY_TILES = registerBlock("red_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    
   public static DeferredBlock<FactoryTilesBlock> BLUE_WHITE_FACTORY_TILES = registerBlock("blue_white_factory_tiles",
            () -> new FactoryTilesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

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