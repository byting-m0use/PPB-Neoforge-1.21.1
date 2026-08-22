package com.blueprint_studios.ppb.items.custom;

import com.blueprint_studios.ppb.blocks.custom.WrenchInteractable;
import com.blueprint_studios.ppb.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class OmniToolItem extends Item {
    public OmniToolItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockState state = level.getBlockState(context.getClickedPos());
        Block block = state.getBlock();

        if(isValidItem(state)){
            if(block instanceof WrenchInteractable interactable){
                interactable.wrenchInteract(level, context.getClickedPos(), state);
                return InteractionResult.SUCCESS;
            }
        }

        return InteractionResult.PASS;
    }

    @Override
    public boolean canAttackBlock(BlockState state, Level level, BlockPos pos, Player player) {
        return !isValidItem(state);
    }

    public boolean isValidItem(BlockState state){
        return state.is(ModTags.Blocks.OMNI_TOOL_INTERACTABLE);
    }
}
