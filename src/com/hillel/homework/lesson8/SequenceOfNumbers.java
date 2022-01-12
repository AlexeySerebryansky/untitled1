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

        int result = check(sequenceOfNumbers);
        if (result == 1) {
            System.out.println("array up");
        } else if (result == 2) {
            System.out.println("array down");
        }else{
            System.out.println("array");
        }


    }


    private static void fillingArray(int[] sequenceOfNumbers) throws IOException {

        for (int i = 0; i < sequenceOfNumbers.length; i++) {
            System.out.println("fill in " + i + " element");
            sequenceOfNumbers[i] = readLine();
        }
    }


    private static int readLine() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return Integer.parseInt(READER.readLine());
    }

    private static int check(int[] sequenceOfNumbers) {

        int counter = 0;

        for (int i = 0; i < sequenceOfNumbers.length - 1; i++) {
            if (sequenceOfNumbers[i] < sequenceOfNumbers[i + 1]) {
                return counter+1;
            } else if (sequenceOfNumbers[i] > sequenceOfNumbers[i + 1]) {
                return counter+2;
            }else{
                return counter+3;
            }
        }
        return counter;
    }


}







