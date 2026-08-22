package com.blueprint_studios.ppb.blocks.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import org.jetbrains.annotations.Nullable;

public class FactoryTilesBlock extends HorizontalDirectionalBlock implements WrenchInteractable{

    public static final MapCodec<FactoryTilesBlock> CODEC = simpleCodec(FactoryTilesBlock::new);

    public FactoryTilesBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public void wrenchInteract(Level level, BlockPos pos, BlockState state) {
        BlockState newState = state.cycle(FACING);

        level.setBlock(pos, newState, 3);
    }
}
