package com.hillel.FirstCourse.classwork.homework.lesson13;



public class HundredPersonPrint {
    public static void main(String[] args) {




        for (int i = 0; i < 100; i++) {
            HundredPerson person = new HundredPerson(AgeRandom(), WeightRandom(), HeightRandom(), Name(), Surname());

            System.out.println(person);
        }

    }

    private static double AgeRandom() {
        int min = 18;
        int max = 90;
        int diff = max - min;
        return Math.random() * (diff + 1) + min;

    }

    private static double WeightRandom() {
        int min = 50;
        int max = 120;
        int diff = max - min;
        return Math.random() * (diff + 1) + min;
    }

    private static double HeightRandom() {
        int min = 150;
        int max = 200;
        int diff = max - min;

        return Math.random() * (diff + 1) + min;
    }


    private static String Name() {

        int random = (int) ((Math.random() * 10) + 1);

        return switch (random) {
            case 1 -> "Alexey";
            case 2 -> "Gevorg";
            case 3 -> "Evgeniy";
            case 4 -> "Pavel";
            case 5 -> "Maxim";
            case 6 -> "Anastasiya";
            case 7 -> "Olga";
            case 8 -> "Irina";
            case 9 -> "Liza";
            case 10 -> "Mariana";
            case 11 -> "Kira";
            default -> null;
        };

    }

    private static String Surname() {
        int random = (int) ((Math.random() * 10) + 1);
        return switch (random) {
            case 1 -> "Serebryanskiy";
            case 2 -> "Kazakov";
            case 3 -> "Gulyk";
            case 4 -> "Maximenko";
            case 5 -> "Shapovalov";
            case 6 -> "Boyko";
            case 7 -> "Laban";
            case 8 -> "Kirilov";
            case 9 -> "Trocenko";
            case 10 -> "Klishin";
            default -> null;
        };

    }


}
