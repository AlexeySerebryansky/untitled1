package com.hillel.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class zerosToTheBeginningOfTheArray {
    public static void main(String[] args) throws IOException {

        System.out.println("how much numbers you have?");
        int[] numbers = new int[reader()];
        fillNumbersArray(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    private static void fillNumbersArray(int[] numbers) throws IOException {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("fill in " + i + " element");
            numbers[i] = reader();
        }
        Arrays.sort(numbers);


    }


    private static int reader() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return Integer.parseInt(READER.readLine());
    }
}
