package com.hillel.classwork.lesson8;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("input");

        int[] numbers = new int[Integer.parseInt(reader.readLine())];

        int num = numbers[0];
        System.out.println(num);

        System.out.println(numbers[4]);

        numbers[3] = 500;

        System.out.println(numbers[3]);

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("input" + i + "element");

            numbers[i] = i + 1;

        }
        printArray(numbers);

    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + "element" + i++));
        }
    }


}
