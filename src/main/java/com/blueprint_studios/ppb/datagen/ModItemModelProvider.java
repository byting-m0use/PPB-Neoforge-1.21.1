package com.blueprint_studios.ppb.datagen;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PoppyPlaytimeBlueprintMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

    private void buttonItem(DeferredBlock<?> deferredBlock, DeferredBlock<Block> baseBlock){
        this.withExistingParent(deferredBlock.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(PoppyPlaytimeBlueprintMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    private void fenceItem(DeferredBlock<?> deferredBlock, DeferredBlock<Block> baseBlock){
        this.withExistingParent(deferredBlock.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(PoppyPlaytimeBlueprintMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    private void wallItem(DeferredBlock<?> deferredBlock, DeferredBlock<Block> baseBlock){
        this.withExistingParent(deferredBlock.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(PoppyPlaytimeBlueprintMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    private void basicItemWithRenderType(Item item, String renderType){
        ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);

        withExistingParent(id.getPath(), mcLoc("item/generated"))
                .texture("layer0", modLoc("item/" + id.getPath()))
                .renderType(renderType);
    }
}
