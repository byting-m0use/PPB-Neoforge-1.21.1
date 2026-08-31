package com.blueprint_studios.ppb.datagen;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.blocks.ModBlocks;
import com.blueprint_studios.ppb.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_BRICKS.get())
                .requires(ModTags.Items.BRICKS)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_bricks", has(ModTags.Items.BRICKS)).save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                Ingredient.of(ModBlocks.WHITE_BRICKS.asItem()),
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.BIG_WHITE_BRICKS.asItem()
                ).unlockedBy("has_white_bricks", has(ModBlocks.WHITE_BRICKS))
                .save(recipeOutput, "ppb:big_white_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(
                Ingredient.of(ModBlocks.WHITE_BRICKS.asItem()),
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SQUARE_WHITE_BRICKS.asItem()
                ).unlockedBy("has_white_bricks", has(ModBlocks.WHITE_BRICKS))
                .save(recipeOutput, "ppb:square_white_bricks_stonecutting");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_BRICKS.get())
                .requires(ModTags.Items.BRICKS)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_bricks", has(ModTags.Items.BRICKS)).save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                Ingredient.of(ModBlocks.BLACK_BRICKS.asItem()),
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.BIG_BLACK_BRICKS.asItem()
                ).unlockedBy("has_black_bricks", has(ModBlocks.BLACK_BRICKS))
                .save(recipeOutput, "ppb:big_black_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(
                Ingredient.of(ModBlocks.BLACK_BRICKS.asItem()),
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SQUARE_BLACK_BRICKS.asItem()
                ).unlockedBy("has_black_bricks", has(ModBlocks.BLACK_BRICKS))
                .save(recipeOutput, "ppb:square_black_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(
                Ingredient.of(Items.BRICKS),
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.BIG_VANILLA_BRICKS.asItem()
                ).unlockedBy("has_bricks", has(Items.BRICKS))
                .save(recipeOutput, "ppb:big_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(
                Ingredient.of(Items.BRICKS),
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SQUARE_VANILLA_BRICKS.asItem()
                ).unlockedBy("has_bricks", has(Items.BRICKS))
                .save(recipeOutput, "ppb:square_bricks_stonecutting");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Items.BRICKS)
                .requires(ModTags.Items.BRICKS)
                .requires(ModTags.Items.SOAP)
                .unlockedBy("has_bricks", has(ModTags.Items.BRICKS)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SQUARE_VANILLA_BRICKS)
                .requires(ModTags.Items.BRICKS_SQUARE)
                .requires(ModTags.Items.SOAP)
                .unlockedBy("has_square_bricks", has(ModTags.Items.BRICKS_SQUARE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIG_VANILLA_BRICKS)
                .requires(ModTags.Items.BRICKS_BIG)
                .requires(ModTags.Items.SOAP)
                .unlockedBy("has_big_bricks", has(ModTags.Items.BRICKS_BIG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIG_WHITE_BRICKS)
                .requires(ModTags.Items.BRICKS_BIG)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_big_bricks", has(ModTags.Items.BRICKS_BIG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SQUARE_WHITE_BRICKS)
                .requires(ModTags.Items.BRICKS_SQUARE)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_square_bricks", has(ModTags.Items.BRICKS_SQUARE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIG_BLACK_BRICKS)
                .requires(ModTags.Items.BRICKS_BIG)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_big_bricks", has(ModTags.Items.BRICKS_BIG)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SQUARE_BLACK_BRICKS)
                .requires(ModTags.Items.BRICKS_SQUARE)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_square_bricks", has(ModTags.Items.BRICKS_SQUARE)).save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.POLISHED_DIORITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_LARGE_FLOORTILE.get())
                .unlockedBy("has_polished_diorite", has(Items.POLISHED_DIORITE)).save(recipeOutput, "ppb:white_large_floortile_stonecutting");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_LARGE_FLOORTILE)
                .requires(ModTags.Items.FLOORTILE)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_floortile", has(ModTags.Items.FLOORTILE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_LARGE_FLOORTILE)
                .requires(ModTags.Items.FLOORTILE)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_floortile", has(ModTags.Items.FLOORTILE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_LARGE_FLOORTILE)
                .requires(ModTags.Items.FLOORTILE)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_floortile", has(ModTags.Items.FLOORTILE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_LARGE_FLOORTILE)
                .requires(ModTags.Items.FLOORTILE)
                .requires(Items.RED_DYE)
                .unlockedBy("has_floortile", has(ModTags.Items.FLOORTILE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_LARGE_FLOORTILE)
                .requires(ModTags.Items.FLOORTILE)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_floortile", has(ModTags.Items.FLOORTILE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_LARGE_FLOORTILE)
                .requires(ModTags.Items.FLOORTILE)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_floortile", has(ModTags.Items.FLOORTILE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_LARGE_FLOORTILE)
                .requires(ModTags.Items.FLOORTILE)
                .requires(Items.PURPLE_DYE)
                .unlockedBy("has_floortile", has(ModTags.Items.FLOORTILE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_LARGE_FLOORTILE)
                .requires(ModTags.Items.FLOORTILE)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_floortile", has(ModTags.Items.FLOORTILE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_LARGE_FLOORTILE)
                .requires(ModTags.Items.FLOORTILE)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_floortile", has(ModTags.Items.FLOORTILE)).save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_LARGE_FLOORTILE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_FACTORY_TILES.get())
                .unlockedBy("has_white_floortile", has(ModBlocks.WHITE_LARGE_FLOORTILE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WHITE_FACTORY_TILES.get())
                .requires(ModBlocks.WHITE_FACTORY_TILES)
                .requires(Items.RED_DYE)
                .unlockedBy("has_white_factory_tile", has(ModBlocks.WHITE_FACTORY_TILES))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WHITE_FACTORY_TILES.get())
                .requires(ModBlocks.WHITE_FACTORY_TILES)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_white_factory_tile", has(ModBlocks.WHITE_FACTORY_TILES))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WHITE_FACTORY_TILES.get())
                .requires(ModBlocks.WHITE_FACTORY_TILES)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_white_factory_tile", has(ModBlocks.WHITE_FACTORY_TILES))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WHITE_FACTORY_TILES.get())
                .requires(ModBlocks.WHITE_FACTORY_TILES)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_white_factory_tile", has(ModBlocks.WHITE_FACTORY_TILES))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WHITE_FACTORY_TILES.get())
                .requires(ModBlocks.WHITE_FACTORY_TILES)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_white_factory_tile", has(ModBlocks.WHITE_FACTORY_TILES))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WHITE_FACTORY_TILES.get())
                .requires(ModBlocks.WHITE_FACTORY_TILES)
                .requires(Items.PURPLE_DYE)
                .unlockedBy("has_white_factory_tile", has(ModBlocks.WHITE_FACTORY_TILES))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WHITE_FACTORY_TILES.get())
                .requires(ModBlocks.WHITE_FACTORY_TILES)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_white_factory_tile", has(ModBlocks.WHITE_FACTORY_TILES))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WHITE_FACTORY_TILES.get())
                .requires(ModBlocks.WHITE_FACTORY_TILES)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_white_factory_tile", has(ModBlocks.WHITE_FACTORY_TILES))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAGONAL_VANILLA_BRICKS.get())
                .requires(ModTags.Items.BRICKS_DIAGONAL)
                .requires(ModTags.Items.SOAP)
                .unlockedBy("has_diagonal_bricks", has(ModTags.Items.BRICKS_DIAGONAL)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAGONAL_WHITE_BRICKS.get())
                .requires(ModTags.Items.BRICKS_DIAGONAL)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_diagonal_bricks", has(ModTags.Items.BRICKS_DIAGONAL)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAGONAL_BLACK_BRICKS.get())
                .requires(ModTags.Items.BRICKS_DIAGONAL)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_diagonal_bricks", has(ModTags.Items.BRICKS_DIAGONAL)).save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.BRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAGONAL_VANILLA_BRICKS)
                .unlockedBy("has_bricks", has(Items.BRICKS))
                .save(recipeOutput, "ppb:diagonal_vanilla_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.WHITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAGONAL_WHITE_BRICKS)
                .unlockedBy("has_white_bricks", has(ModBlocks.WHITE_BRICKS.get()))
                .save(recipeOutput, "ppb:diagonal_white_bricks_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.BLACK_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAGONAL_BLACK_BRICKS)
                .unlockedBy("has_black_bricks", has(ModBlocks.BLACK_BRICKS.get()))
                .save(recipeOutput, "ppb:diagonal_black_bricks_stonecutting");

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
        float pExperience, int pCookingTime, String pGroup){
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup){
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName){
        for(ItemLike itemLike : pIngredients){
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemLike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemLike), has(itemLike))
                    .save(recipeOutput, PoppyPlaytimeBlueprintMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemLike));
        }
    }
}
