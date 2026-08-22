package com.blueprint_studios.ppb.util;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> OMNI_TOOL_INTERACTABLE = createTag("omni_tool_interactable");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(PoppyPlaytimeBlueprintMod.MOD_ID, name));
        }
    }

    public static class Items{
        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(PoppyPlaytimeBlueprintMod.MOD_ID, name));
        }
    }
}
