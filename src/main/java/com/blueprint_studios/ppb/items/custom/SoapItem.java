package com.blueprint_studios.ppb.items.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

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
}
