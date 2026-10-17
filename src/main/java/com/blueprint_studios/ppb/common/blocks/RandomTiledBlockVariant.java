package com.blueprint_studios.ppb.common.blocks;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.RegistryFileCodec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.ExtraCodecs;

public record RandomTiledBlockVariant(int width, int height, ResourceLocation assetId) {
    public static final Codec<RandomTiledBlockVariant> DIRECT_CODEC = RecordCodecBuilder.create((p_345420_) -> p_345420_.group(ExtraCodecs.intRange(1, 16).fieldOf("width").forGetter(RandomTiledBlockVariant::width), ExtraCodecs.intRange(1, 16).fieldOf("height").forGetter(RandomTiledBlockVariant::height), ResourceLocation.CODEC.fieldOf("asset_id").forGetter(RandomTiledBlockVariant::assetId)).apply(p_345420_, RandomTiledBlockVariant::new));
    public static final StreamCodec<ByteBuf, RandomTiledBlockVariant> DIRECT_STREAM_CODEC;
    //public static final Codec<Holder<RandomTiledBlockVariant>> CODEC;
    //public static final StreamCodec<RegistryFriendlyByteBuf, Holder<RandomTiledBlockVariant>> STREAM_CODEC;

    public int area() {
        return this.width() * this.height();
    }

    static {
        DIRECT_STREAM_CODEC = StreamCodec.composite(ByteBufCodecs.VAR_INT, RandomTiledBlockVariant::width, ByteBufCodecs.VAR_INT, RandomTiledBlockVariant::height, ResourceLocation.STREAM_CODEC, RandomTiledBlockVariant::assetId, RandomTiledBlockVariant::new);
        //CODEC = RegistryFileCodec.create((net.minecraft.resources.ResourceKey<? extends net.minecraft.core.Registry<RandomTiledBlockVariant>>) Registries.PAINTING_VARIANT, DIRECT_CODEC);
        //STREAM_CODEC = ByteBufCodecs.holder((net.minecraft.resources.ResourceKey<? extends net.minecraft.core.Registry<RandomTiledBlockVariant>>) Registries.PAINTING_VARIANT, DIRECT_STREAM_CODEC);
    }
}
