package com.blueprint_studios.ppb.datagen;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PoppyPlaytimeBlueprintMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

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

    private void blockItem(DeferredBlock<?> deferredBlock){
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("redfoxysfnaf:block/" + deferredBlock.getId().getPath()));
    }
}
