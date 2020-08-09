package com.dontwea;

public class Car {
    private Wheel leftWheel;
    private Wheel rightWheel;

    public String merk;
    private String eigenaar;

    public Car(String merk, String eigenaar) {

        this.merk = merk;
        this.eigenaar = eigenaar;

        //this.eigenaar = StandaardEigenaar();

        //this.PrintMerkEnEigenaar();
        this.leftWheel = new Wheel(10);
        this.rightWheel = new Wheel(10);
    }

    public void StartCar()
    {
        this.leftWheel.StartWheel();
        this.rightWheel.StartWheel();
    }

    public void StopCar()
    {
        this.leftWheel.StopWheel();
        this.rightWheel.StopWheel();
    }

    private String StandaardEigenaar()
    {
        return "Jan";
    }

    public void PrintMerkEnEigenaar()
    {
        System.out.println("Merk: " + merk + ", eigenaar: " + eigenaar);
    }
}
