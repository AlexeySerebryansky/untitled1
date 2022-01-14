package com.hillel.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class lottery {
    public static void main(String[] args) throws IOException {

        int[] lotteryNumbers = new int[7];

        int[] lotteryNumbersUser = new int[7];

        System.out.println("enter your numbers in your lottery ticket: ");



        System.out.println("your lottery numbers: " + Arrays.toString(fillingLotteryNumbersUser(lotteryNumbersUser)));
        System.out.println("lottery numbers: " + Arrays.toString(fillingLotteryNumbers(lotteryNumbers)));

    }

    private static int[] fillingLotteryNumbers(int[] lotteryNumbers) {

        for (int i = 0; i < lotteryNumbers.length; i++) {

            lotteryNumbers[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(lotteryNumbers);
        return lotteryNumbers;
    }

    private static int[] fillingLotteryNumbersUser(int[] lotteryNumbersUser) throws IOException {

        for (int i = 0; i < lotteryNumbersUser.length; i++) {
            System.out.println("fill in " + (i + 1) + " number your ticket");
            lotteryNumbersUser[i] = readLine();
        }
        Arrays.sort(lotteryNumbersUser);
        return lotteryNumbersUser;
    }














    private static int readLine() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return Integer.parseInt(READER.readLine());
    }
}
