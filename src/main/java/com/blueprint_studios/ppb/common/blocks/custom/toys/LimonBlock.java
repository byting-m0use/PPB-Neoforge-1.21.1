package com.blueprint_studios.ppb.common.blocks.custom.toys;

import com.blueprint_studios.ppb.common.blocks.custom.WrenchInteractable;
import com.blueprint_studios.ppb.common.sounds.ModSoundTypes;
import com.blueprint_studios.ppb.common.sounds.ModSounds;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class LimonBlock extends HorizontalDirectionalBlock implements WrenchInteractable {
    public static final MapCodec<LimonBlock> CODEC = simpleCodec(LimonBlock::new);
    private static final VoxelShape SHAPE = Block.box(3.0, 0.0, 3.0, 13.0, 7.0, 13.0);

    public LimonBlock(Properties properties) {
        super(properties.sound(ModSoundTypes.LIMON_SOUNDS));
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public void wrenchInteract(Level level, BlockPos pos, BlockState state) {
        BlockState newState = state.cycle(FACING);

        level.setBlock(pos, newState, 3);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        level.playSound(player, pos, ModSounds.LIMON.get(), SoundSource.BLOCKS);
        return super.useWithoutItem(state, level, pos, player, hitResult);
    }
}
