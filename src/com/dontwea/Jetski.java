package com.dontwea;

public class Jetski extends Voertuig {
    private static final int MAX_JETSKI_SPEED = 80;

    @Override
    public int GetMaximumSpeed() {
        return MAX_JETSKI_SPEED;
    }
}