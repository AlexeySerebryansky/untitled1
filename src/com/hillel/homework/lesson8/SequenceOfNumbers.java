package com.hillel.homework.lesson8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SequenceOfNumbers {


    public static void main(String[] args) throws IOException {


        System.out.println("set the length of the array");
        int[] sequenceOfNumbers = new int[readLine()];

        System.out.println("fill the array");
        fillingArray(sequenceOfNumbers);
        System.out.println("your numbers : " + Arrays.toString(sequenceOfNumbers));

        boolean result = Сheck(sequenceOfNumbers);
        if (result==true) {
            System.out.println("array up");
        } else if(result==false){
            System.out.println("array down");
        }


    }


    private static int fillingArray(int[] sequenceOfNumbers) throws IOException {

        for (int i = 0; i < sequenceOfNumbers.length; i++) {
            System.out.println("fill in " + i + " element");
            sequenceOfNumbers[i] = readLine();
        }
        return 0;
    }


    private static int readLine() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        int reader = Integer.parseInt(READER.readLine());
        return reader;
    }

    private static boolean Сheck(int[] sequenceOfNumbers) {
        boolean up = true;
        boolean down = false;

        for (int i = 0; i < sequenceOfNumbers.length - 1; i++) {
            if (sequenceOfNumbers[i] < sequenceOfNumbers[i + 1]) {
                return up;
            } else if (sequenceOfNumbers[i] > sequenceOfNumbers[i + 1]) {
                return down;
            }
        }
        return up;
    }


}







