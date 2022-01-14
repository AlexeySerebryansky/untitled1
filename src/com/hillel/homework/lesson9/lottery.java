package com.hillel.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class lottery {
    public static void main(String[] args) throws IOException {

        int[] lotteryNumbers = fillingLotteryNumbers();

        int[] lotteryNumbersUser = fillingLotteryNumbersUser();

        System.out.println("enter your numbers in your lottery ticket: ");


        System.out.println("your lottery numbers: " + Arrays.toString(lotteryNumbersUser));
        System.out.println("lottery numbers: " + Arrays.toString(lotteryNumbers));
        System.out.println("количество совпадений: " + check(lotteryNumbers, lotteryNumbersUser));
        System.out.println(prize(check(lotteryNumbers, lotteryNumbersUser)) + "we congratulate you, to receive a prize, show your ticket at the main office of the company");

    }

    private static int[] fillingLotteryNumbers() {

        int[] lotteryNumbers = new int[7];

        for (int i = 0; i < lotteryNumbers.length; i++) {

            lotteryNumbers[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(lotteryNumbers);
        return lotteryNumbers;
    }

    private static int[] fillingLotteryNumbersUser() throws IOException {

        int[] lotteryNumbersUser = new int[7];

        for (int i = 0; i < lotteryNumbersUser.length; i++) {
            System.out.println("fill in " + (i + 1) + " number your ticket");
            lotteryNumbersUser[i] = readLine();
        }
        Arrays.sort(lotteryNumbersUser);
        return lotteryNumbersUser;
    }

    private static int check(int[] lotteryNumbers, int[] lotteryNumbersUser) {

        int coincidences = 0;


        for (int i = 0; i < lotteryNumbers.length - 1; i++) {
            if (lotteryNumbers[i] == lotteryNumbersUser[i]) coincidences++;
        }

        return coincidences;
    }

    private static String prize(int check) {

        switch (check) {
            case 1 -> System.out.println("your win is 10$");
            case 2 -> System.out.println("your win is 100$");
            case 3 -> System.out.println("your win is 200$");
            case 4 -> System.out.println("your win is 300$");
            case 5 -> System.out.println("your win is 1000$");
            case 6 -> System.out.println("your win is 15000$");
            case 7 -> System.out.println("your win is 100000$ jackpot ");
        }
        return null;
    }


    private static int readLine() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return Integer.parseInt(READER.readLine());
    }
}
