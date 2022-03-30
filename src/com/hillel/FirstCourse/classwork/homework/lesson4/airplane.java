package com.hillel.FirstCourse.classwork.homework.lesson4;

public class airplane {

    public static void main(String[] args) {


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