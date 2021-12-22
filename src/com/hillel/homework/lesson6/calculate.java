package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter your number: ");

        double firstNumber = Integer.parseInt((READER.readLine()));
        double secondNumber = Integer.parseInt(READER.readLine());

        System.out.println("enter your operation: ");
        char operation = (char) Integer.parseInt(READER.readLine());




        switch (operation) {
            case '+':
                System.out.println(firstNumber + secondNumber + "sum");
                break;
            case '-':
                System.out.println(firstNumber - secondNumber + "difference" );
                break;


        }

    }
}




