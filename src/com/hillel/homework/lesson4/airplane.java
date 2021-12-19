package com.hillel.homework.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class airplane {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printAirplaneInfo("jet", " f22");
        printAirplaneInfo("Airliner", " Aerobus 737", 120);
        printAirplaneInfo("Airliner", " Boeing 777", 180, 28);


    }

    private static void printAirplaneInfo(String planeName, String planeType) {
        System.out.println("Type Aeroplane: " + planeName + " - Model:" + planeType);

    }

    private static void printAirplaneInfo(String planeName, String planeType, int amountEconomSeats) {
        System.out.println("Type Aeroplane: " + planeName + " - Model:" + planeType + ", amount Econom Seats:" + amountEconomSeats);
    }


    private static void printAirplaneInfo(String planeName, String planeType, int amountEconomSeats, int amountBuisnesSeats) {
        System.out.println("Type Aeroplane: " + planeName + " - Model:" + planeType + ", amount Econom Seats:" + amountEconomSeats + ", amount Buisnes Seats:" + amountBuisnesSeats);

    }
}