package com.blueprint_studios.ppb.common.blocks.custom.functionality;

import com.blueprint_studios.ppb.common.blocks.entity.PlaytimeOsBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class PlaytimeOsBlock extends BaseEntityBlock {
    public static final MapCodec<PlaytimeOsBlock> CODEC = simpleCodec(PlaytimeOsBlock::new);

    public PlaytimeOsBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new PlaytimeOsBlockEntity(blockPos, blockState);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(level, pos));
            return InteractionResult.SUCCESS;
        }
    }

    //@Override
    //protected @Nullable MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        //return new SimpleMenuProvider(
               // (p_48785_, p_48786_, p_48787_) -> new PlaytimeOsMenu()
        //)
    //}
}
