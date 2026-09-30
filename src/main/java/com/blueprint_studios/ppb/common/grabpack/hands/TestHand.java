package com.blueprint_studios.ppb.common.grabpack.hands;

public class TestHand extends Hand{
    TestHand(Properties properties) {
        super(properties);
    }

    @Override
    public HandColor getColor() {
        return HandColor.WHITE;
    }

    @Override
    public boolean isLeftHand() {
        return true;
    }
}
