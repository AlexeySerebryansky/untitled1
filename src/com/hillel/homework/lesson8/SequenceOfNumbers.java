package com.hillel.homework.lesson8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SequenceOfNumbers {


    public static void main(String[] args) throws IOException {


        System.out.println("set the length of the array");
        int[] SequenceOfNumbers = new int[readLine()];

        System.out.println("fill the array");
        printArray(SequenceOfNumbers);
        System.out.println("your numbers : " + Arrays.toString(SequenceOfNumbers));

        int result = Сheck(SequenceOfNumbers);
        if (result == SequenceOfNumbers.length - 1) {
            System.out.println("up");
        } else if (result * (-1) == SequenceOfNumbers.length - 1) {
            System.out.println("down");
        } else {
            System.out.println("array");
        }


    }


    private static int printArray(int[] SequenceOfNumbers) throws IOException {

        for (int i = 0; i < SequenceOfNumbers.length; i++) {
            System.out.println("fill in " + i + " element");
            SequenceOfNumbers[i] = readLine();
        }
        return 0;
    }


    private static int readLine() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        int Reader = Integer.parseInt(READER.readLine());
        return Reader;
    }

    private static int Сheck(int[] SequenceOfNumbers)  {

        int tipe = 0;

        for (int i = 0; i < SequenceOfNumbers.length - 1; i++) {
            if (SequenceOfNumbers[i] < SequenceOfNumbers[i + 1]) {
                tipe++;
            } else if (SequenceOfNumbers[i] > SequenceOfNumbers[i + 1]) {
                tipe--;
            }
        }
        return tipe;

    }


}







