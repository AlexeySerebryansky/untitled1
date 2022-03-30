package com.hillel.FirstCourse.classwork.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class randomNumbers {
    public static void main(String[] args) throws IOException {

        System.out.println("the largest of them: " + OperationWithArrayNumbers());

    }


    private static Integer OperationWithArrayNumbers() throws IOException {
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.println("fill, if you want STOP - press '0' ");
            int input = reader();
            if (input == (0)) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("your array: " + Arrays.toString(numbers.toArray(new Integer[0])));

        return Collections.max(numbers);
    }


    private static int reader() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return Integer.parseInt(READER.readLine());
    }
}
