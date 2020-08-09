package com.dontwea;

public class Main {

    public static void main(String[] args) {

        Car carVanPietje = new Car("Ford", "Pietje");
        carVanPietje.merk = "Ferrari";
        carVanPietje.Start();
        carVanPietje.PrintMerkEnEigenaar();

        Voertuig voertuig = new Jetski();
        int speed  = voertuig.GetMaximumSpeed();
        System.out.println("Maximum speed is: " + speed);
    }
}
