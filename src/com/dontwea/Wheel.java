package com.dontwea;

public class Wheel {
    private int diameter;
    private boolean isSpinning;

    public Wheel(int diameter) {
        this.diameter = diameter;
        isSpinning = false;
    }

    public void StartWheel()
    {
        this.isSpinning = true;
    }

    public void StopWheel()
    {
        this.isSpinning = false;
    }
}
