package com.hillel.FirstCourse.classwork.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionFactorial {
    public static void main(String[] args) throws IOException {
        System.out.println("enter your number to calculate factorial: ");
        int numberFactorial = reader();

        System.out.println("factorial of your number :" + numberFactorial + " = " + factorial(numberFactorial));

    }

    private static int factorial(int numbers) {
        if (numbers == 1) {
            return numbers;
        }
        return numbers * factorial(numbers - 1);

    }

    private static int reader() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return Integer.parseInt(READER.readLine());
    }
}