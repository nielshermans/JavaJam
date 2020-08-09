package com.dontwea;

public class Main {

    public static void main(String[] args) {

        Car carVanPietje = new Car("Ford", "Pietje");
        carVanPietje.merk = "Ferrari";
        carVanPietje.StartCar();
        carVanPietje.PrintMerkEnEigenaar();
    }
}
