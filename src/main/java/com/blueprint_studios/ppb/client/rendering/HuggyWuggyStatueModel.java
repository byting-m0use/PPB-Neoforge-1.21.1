package com.blueprint_studios.ppb.client.rendering;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class HuggyWuggyStatueModel<T extends GeoBlockEntity> extends GeoModel<T> {

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return ResourceLocation.fromNamespaceAndPath("ppb", "animations/huggy_statue_idle.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(T animatable) {
        return ResourceLocation.fromNamespaceAndPath("ppb", "geo/huggy_wuggy_pose1.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T animatable) {
        return ResourceLocation.fromNamespaceAndPath("ppb", "textures/block/huggy_vanilla.png");
    }
}
