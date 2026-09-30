package com.blueprint_studios.ppb.common.items.custom;

import com.blueprint_studios.ppb.client.particles.ModParticles;
import com.blueprint_studios.ppb.common.items.ModItems;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SoapItem extends Item {
    public SoapItem(Properties properties, int durability) {
        super(properties.durability(durability));
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return takeDamage(itemStack);
    }

    public static ItemStack takeDamage(ItemStack itemStack) {
        ItemStack remaining = itemStack.copy();

        remaining.setDamageValue(remaining.getDamageValue() + 1);

        if(remaining.getDamageValue() >= remaining.getMaxDamage()) {
            return ItemStack.EMPTY;
        }

        return remaining;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        MinecraftServer server = level.getServer();
        if(!level.isClientSide) {
                if (player.hasItemInSlot(EquipmentSlot.MAINHAND) || player.hasItemInSlot(EquipmentSlot.OFFHAND) && level.isRaining()) {
                    ((ServerLevel) level).sendParticles(ModParticles.SOAP_PARTICLES.get(),
                            player.getX() + 0.5, player.getY() + 0.5,
                            player.getZ() + 0.5, 10, 0, 5, 0, 3);

                }
            }
        return null;
    }
}
