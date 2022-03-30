package com.hillel.FirstCourse.classwork.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CopyingAnArray {


    public static void main(String[] args) throws IOException {

        System.out.println("set the length of the array  multiple of 2");

        int[] arrayFirst = new int[readLine()];

        fillArrayFirst(arrayFirst);

        System.out.println("your array" + Arrays.toString(arrayFirst));

        int[] arraySecond = Arrays.copyOf(arrayFirst, arrayFirst.length / 2);
        int[] arrayThird = Arrays.copyOfRange(arrayFirst, arrayFirst.length/2, arrayFirst.length);

        System.out.println("first half of array: " + Arrays.toString(arraySecond));
        System.out.println("third half of array: " + Arrays.toString(arrayThird));


    }

    private static void fillArrayFirst(int[] arrayFirst) throws IOException {


        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.println("fill in " + (i + 1) + " element");
            arrayFirst[i] = readLine();
        }

    }


    private static int readLine() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return Integer.parseInt(READER.readLine());
    }


}
