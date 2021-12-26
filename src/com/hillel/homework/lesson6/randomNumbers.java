package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class randomNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));


        double firstNumber;
        double secondNumbers;
        double thirdNumbers;

        System.out.println("Enter value for first number");
        firstNumber = Integer.parseInt((READER.readLine()));
        System.out.println("Enter value for second number");
        secondNumbers = Integer.parseInt((READER.readLine()));
        System.out.println("Enter value for third number");
        thirdNumbers = Integer.parseInt((READER.readLine()));


        if (firstNumber > secondNumbers && firstNumber > thirdNumbers) {
            System.out.println(firstNumber);
        }
        if (secondNumbers > firstNumber && secondNumbers > thirdNumbers) {
            System.out.println(secondNumbers);
        }
        if (thirdNumbers > firstNumber && thirdNumbers > secondNumbers) {
            System.out.println(thirdNumbers);
        }


    }
}
