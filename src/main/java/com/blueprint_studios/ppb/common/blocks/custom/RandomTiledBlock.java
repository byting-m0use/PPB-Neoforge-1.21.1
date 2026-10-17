package com.blueprint_studios.ppb.common.blocks.custom;

import com.blueprint_studios.ppb.common.blocks.RandomTiledBlockVariant;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.Holder;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.VariantHolder;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.level.block.Block;

public class RandomTiledBlock extends Block implements VariantHolder<Holder<RandomTiledBlockVariant>> {
    public static final MapCodec<Holder<PaintingVariant>> VARIANT_MAP_CODEC = PaintingVariant.CODEC.fieldOf("variant");
    public static final Codec<Holder<PaintingVariant>> VARIANT_CODEC = VARIANT_MAP_CODEC.codec();

    public RandomTiledBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void setVariant(Holder<RandomTiledBlockVariant> variant) {

    }

    @Override
    public Holder<RandomTiledBlockVariant> getVariant() {
        return null;
    }
}
