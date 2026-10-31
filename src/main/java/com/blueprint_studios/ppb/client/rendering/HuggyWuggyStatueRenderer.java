package com.blueprint_studios.ppb.client.rendering;

import com.blueprint_studios.ppb.common.blocks.entity.HuggyWuggyBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class HuggyWuggyStatueRenderer extends GeoBlockRenderer<HuggyWuggyBlockEntity> {

    public HuggyWuggyStatueRenderer(BlockEntityRendererProvider.Context context) {
        super(new HuggyWuggyStatueModel());
    }

    public @Nullable RenderType getRenderType(HuggyWuggyBlockEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityCutout(texture);
    }
}
