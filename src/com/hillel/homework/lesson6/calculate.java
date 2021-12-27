package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter your equation :  ");

        double firstNumber = Integer.parseInt((READER.readLine()));
        String operation = String.valueOf(Integer.parseInt(READER.readLine()));
        double secondNumber = Integer.parseInt(READER.readLine());


        switch (operation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
            case "-":
                System.out.println(firstNumber - secondNumber);
            case "/":
                System.out.println(firstNumber / secondNumber);
            case "*":
                System.out.println(firstNumber * secondNumber);
        }


    }
}




