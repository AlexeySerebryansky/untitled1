package com.hillel.classwork.lesson10;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

    private static int factorial(int numbers) {
        if (numbers == 1) {
            return numbers;
        }
        return numbers * factorial(numbers - 1);
    }

}
