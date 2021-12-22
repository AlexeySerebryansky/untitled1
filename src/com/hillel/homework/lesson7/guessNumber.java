package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class guessNumber {
    public static void main(String[] args) throws IOException {

        System.out.println("okay, lats go. You have to guess the number i thought (from 0 to 10). Good lack)))");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int yourNumber = Integer.parseInt((reader.readLine()));
        int firstNumberRandom = 0;
        int lastNumberRandom = 10;
        int random = firstNumberRandom + (int) (Math.random() * lastNumberRandom);

        System.out.println("your number = " + yourNumber);
        System.out.println("random number = " + random);


        while (yourNumber != random);
        System.out.println("try again");


        {
            System.out.println("you win");
        }


    }
}
