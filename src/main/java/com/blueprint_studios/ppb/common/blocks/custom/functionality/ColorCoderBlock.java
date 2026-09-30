package com.blueprint_studios.ppb.common.blocks.custom.functionality;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class ColorCoderBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final MapCodec<ColorCoderBlock> CODEC = simpleCodec(ColorCoderBlock::new);
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final float AABB_OFFSET = 3.0F;
    protected static final VoxelShape EAST_AABB = Block.box(0.0, 2.0, 0.0, 3.0, 14.0, 16.0);
    protected static final VoxelShape WEST_AABB = Block.box(13.0, 2.0, 0.0, 12.0, 14.0, 16.0);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0, 2.0, 0.0, 12.0, 14.0, 3.0);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0, 2.0, 13.0, 12.0, 14.0, 16.0);

    public ColorCoderBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch ((Direction)state.getValue(FACING)) {
            case NORTH:
                return NORTH_AABB;
            case SOUTH:
                return SOUTH_AABB;
            case WEST:
                return WEST_AABB;
            case EAST:
            default:
                return EAST_AABB;
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }
}
