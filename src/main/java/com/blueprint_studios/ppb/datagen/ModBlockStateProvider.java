package com.blueprint_studios.ppb.datagen;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.blocks.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PoppyPlaytimeBlueprintMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SQUARE_VANILLA_BRICKS);
        blockWithItem(ModBlocks.BIG_VANILLA_BRICKS);
        blockWithItem(ModBlocks.DIAGONAL_VANILLA_BRICKS);

        blockWithItem(ModBlocks.SQUARE_WHITE_BRICKS);
        blockWithItem(ModBlocks.BIG_WHITE_BRICKS);
        blockWithItem(ModBlocks.WHITE_BRICKS);
        blockWithItem(ModBlocks.DIAGONAL_WHITE_BRICKS);

        blockWithItem(ModBlocks.SQUARE_BLACK_BRICKS);
        blockWithItem(ModBlocks.BIG_BLACK_BRICKS);
        blockWithItem(ModBlocks.BLACK_BRICKS);
        blockWithItem(ModBlocks.DIAGONAL_BLACK_BRICKS);

        blockWithItem(ModBlocks.PLUSH_BRICKS);
        blockWithItem(ModBlocks.BIG_PLUSH_BRICKS);
        blockWithItem(ModBlocks.WHITE_RED_BIG_PLUSH_BRICKS);
        blockWithItem(ModBlocks.WHITE_BLUE_BIG_PLUSH_BRICKS);
        blockWithItem(ModBlocks.WHITE_YELLOW_BIG_PLUSH_BRICKS);

        blockWithItem(ModBlocks.WHITE_FACTORY_TILES);
        horizontalDirectionBlockWithItemDifferentTextures(ModBlocks.YELLOW_WHITE_FACTORY_TILES);
        horizontalDirectionBlockWithItemDifferentTextures(ModBlocks.RED_WHITE_FACTORY_TILES);
        horizontalDirectionBlockWithItemDifferentTextures(ModBlocks.BLUE_WHITE_FACTORY_TILES);
        horizontalDirectionBlockWithItemDifferentTextures(ModBlocks.PINK_WHITE_FACTORY_TILES);
        horizontalDirectionBlockWithItemDifferentTextures(ModBlocks.GREEN_WHITE_FACTORY_TILES);
        horizontalDirectionBlockWithItemDifferentTextures(ModBlocks.PURPLE_WHITE_FACTORY_TILES);
        horizontalDirectionBlockWithItemDifferentTextures(ModBlocks.LIGHT_BLUE_WHITE_FACTORY_TILES);
        horizontalDirectionBlockWithItemDifferentTextures(ModBlocks.ORANGE_WHITE_FACTORY_TILES);

        blockWithItem(ModBlocks.BLACK_ARCADE_CARPET);

        blockWithItem(ModBlocks.BLUE_LARGE_FLOORTILE);
        blockWithItem(ModBlocks.RED_LARGE_FLOORTILE);
        blockWithItem(ModBlocks.YELLOW_LARGE_FLOORTILE);
        blockWithItem(ModBlocks.WHITE_LARGE_FLOORTILE);
        blockWithItem(ModBlocks.PINK_LARGE_FLOORTILE);
        blockWithItem(ModBlocks.GREEN_LARGE_FLOORTILE);
        blockWithItem(ModBlocks.PURPLE_LARGE_FLOORTILE);
        blockWithItem(ModBlocks.LIGHT_BLUE_LARGE_FLOORTILE);
        blockWithItem(ModBlocks.ORANGE_LARGE_FLOORTILE);
        blockWithItem(ModBlocks.SECURITY_OFFICE_FLOORTILE);

        blockWithItem(ModBlocks.CONCRETE_FLOORING);

        blockWithItem(ModBlocks.GRAY_WOOD_PLANKS);

        blockWithItem(ModBlocks.BASIC_WALLS_BLUE);
        blockWithItem(ModBlocks.BASIC_WALLS_TAN);
        blockWithItem(ModBlocks.BASIC_WALLS_BLACK);
        blockWithItem(ModBlocks.BASIC_WALLS_RED);
        blockWithItem(ModBlocks.BASIC_WALLS_YELLOW);
        blockWithItem(ModBlocks.BASIC_WALLS_WHITE);

        blockWithItem(ModBlocks.GIFT_SHOP_WALL_RED);
        blockWithItem(ModBlocks.GIFT_SHOP_WALL_TAN);
        blockWithItem(ModBlocks.GIFT_SHOP_WALL_BLUE);
        blockWithItem(ModBlocks.GIFT_SHOP_WALL_YELLOW);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void translucentBlockWithItem(DeferredBlock<?> deferredBlock){
        String name = deferredBlock.getId().getPath();

        BlockModelBuilder model = models().cubeAll(name, modLoc("block/" + name)).renderType("translucent");
        simpleBlock(deferredBlock.get(), model);
        //simpleBlockItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
        blockItem(deferredBlock);
    }

    private void translucentPaneBlock(DeferredBlock<IronBarsBlock> deferredBlock, DeferredBlock<?> paneTexture){
        String name = deferredBlock.getId().getPath();
        String paneName = paneTexture.getId().getPath();

        paneBlockWithRenderType(deferredBlock.get(), modLoc("block/" + paneName), modLoc("block/" + name + "_top"),"translucent");

    }

    private void doorBlockWithRenderType(DeferredBlock<?> deferredBlock, String renderType){
        if(deferredBlock.get() instanceof DoorBlock door){
            doorBlockWithRenderType(door, modLoc("block/" + deferredBlock.getId().getPath() + "_bottom"), modLoc("block/" + deferredBlock.getId().getPath() + "_top"), renderType);
        }else{
            System.err.println(deferredBlock.getId().getPath() + " is not a DoorBlock.");
        }
    }

    private void doorBlock(DeferredBlock<?> deferredBlock){
        if(deferredBlock.get() instanceof DoorBlock door){
            doorBlock(door, modLoc("block/" + deferredBlock.getId().getPath() + "_bottom"), modLoc("block/" + deferredBlock.getId().getPath() + "_top"));
        }else{
            System.err.println(deferredBlock.getId().getPath() + " is not a DoorBlock.");
        }
    }

    private void horizontalDirectionBlockWithItemDifferentTextures(DeferredBlock<?> deferredBlock){
        if(!(deferredBlock.get() instanceof HorizontalDirectionalBlock)) return;

        String name = deferredBlock.getId().getPath();

        ModelFile northModel = models().cubeAll(name + "_north",
                modLoc("block/" + name + "_north"));

        ModelFile eastModel = models().cubeAll(name + "_east",
                modLoc("block/" + name + "_east"));

        ModelFile southModel = models().cubeAll(name + "_south",
                modLoc("block/" + name + "_south"));

        ModelFile westModel = models().cubeAll(name + "_west",
                modLoc("block/" + name + "_west"));
        getVariantBuilder(deferredBlock.get())
                .forAllStates(state -> {
                    Direction direction = state.getValue(HorizontalDirectionalBlock.FACING);

                    return ConfiguredModel.builder()
                            .modelFile(switch (direction) {
                                case NORTH -> northModel;
                                case EAST -> eastModel;
                                case WEST -> westModel;
                                case SOUTH -> southModel;
                                default -> northModel;
                            }).build();
                });

        simpleBlockItem(deferredBlock.get(), northModel);

    }

    private void blockItem(DeferredBlock<?> deferredBlock){
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("redfoxysfnaf:block/" + deferredBlock.getId().getPath()));
    }
}
