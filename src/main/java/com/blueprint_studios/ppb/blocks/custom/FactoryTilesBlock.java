package com.blueprint_studios.ppb.blocks.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class FactoryTilesBlock extends HorizontalDirectionalBlock implements WrenchInteractable{
    public static final MapCodec<FactoryTilesBlock> CODEC = simpleCodec(FactoryTilesBlock::new);

    List<Direction> directions = new ArrayList<>();

    public FactoryTilesBlock(Properties properties) {
        super(properties);
        directions.add(Direction.EAST);
        directions.add(Direction.NORTH);
        directions.add(Direction.SOUTH);
        directions.add(Direction.WEST);
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
        int randomNumber = (int)(Math.random() * 4);
        return this.defaultBlockState().setValue(FACING, directions.get(randomNumber));
    }

    @Override
    public void wrenchInteract(Level level, BlockPos pos, BlockState state) {
        BlockState newState = state.cycle(FACING);

        level.setBlock(pos, newState, 3);
    }
}
