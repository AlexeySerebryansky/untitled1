package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt((READER.readLine()));
        int secondNumber = Integer.parseInt(READER.readLine());
        int operation = Integer.parseInt(READER.readLine());

        switch (firstNumber + secondNumber + operation) {
            case '+' ->
                    System.out.println(firstNumber + secondNumber);
            case '-' ->
                    System.out.println(firstNumber - secondNumber);
            case '/' ->
                    System.out.println(firstNumber / secondNumber);
            case '*' ->
                    System.out.println(firstNumber * secondNumber);
        }


    }

}
