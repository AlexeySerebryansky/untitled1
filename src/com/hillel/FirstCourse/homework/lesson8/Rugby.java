package com.hillel.FirstCourse.homework.lesson8;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

        int[] firstTeam = firstTeam();
        int[] secondTeam = secondTeam();

        System.out.println("age first team : " + Arrays.toString(firstTeam));
        System.out.println("age second team : " + Arrays.toString(secondTeam));


        System.out.println("mean arephmitic age first team : " + averageFirstTeam(firstTeam));
        System.out.println("mean arephmitic age second team : " + averageSecondTeam(secondTeam));

        comparison(averageFirstTeam(firstTeam), averageSecondTeam(secondTeam));

    }

    private static int[] firstTeam() {

        int[] amountFirstTeam = new int[25];
        int firstNumberRandom = 18;
        double lastNumberRandom = 22.5;


        for (int i = 0; i < amountFirstTeam.length; i++) {
            amountFirstTeam[i] = (int) (firstNumberRandom + (Math.random() * lastNumberRandom));

        }

        return amountFirstTeam;

    }

    private static int[] secondTeam() {

        int[] amountSecondTeam = new int[25];
        int firstNumberRandom = 18;
        double lastNumberRandom = 22.5;


        for (int i = 0; i < amountSecondTeam.length; i++) {
            amountSecondTeam[i] = (int) (firstNumberRandom + (Math.random() * lastNumberRandom));

        }

        return amountSecondTeam;

    }

    private static double averageFirstTeam(int[] firstTeam) {

        double averageFirstTeam = 0;
        for (double d : firstTeam) {
            averageFirstTeam += d;
        }


        return averageFirstTeam / firstTeam.length;


    }

    private static double averageSecondTeam(int[] secondTeam) {
        double averageSecondTeam = 0;

        for (double d : secondTeam) {
            averageSecondTeam += d;
        }

        return averageSecondTeam / secondTeam.length;
    }


    private static void comparison(double averageFirstTeam, double averageSecondTeam) {



        if (averageFirstTeam > averageSecondTeam) {
            System.out.println("the average age of the first team is higher than average age of the second team be : " + (averageFirstTeam - averageSecondTeam));

        } else if (averageFirstTeam < averageSecondTeam) {
            System.out.println("the average age of the second team is higher than average age of the firs team be : " + (averageSecondTeam - averageFirstTeam));

        } else {
            System.out.println("the teams have the same average age");

        }

    }


}
