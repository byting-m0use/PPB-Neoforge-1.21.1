package com.blueprint_studios.ppb.common.grabpack.hands;

import net.minecraft.world.item.Item;

public abstract class Hand extends Item {
    Hand(Properties properties) {
        super(properties);
    }

    public abstract HandColor getColor();

    public abstract boolean isLeftHand();
}
