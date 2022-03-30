package com.hillel.FirstCourse.classwork.homework.lesson7;

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


        while (yourNumber != random) {

            if (yourNumber < 0 || yourNumber > 10) {
                System.out.println("you have to guess a number between 0 and 10. Don`t cheat");
                return;
            }

            System.out.println("your number: " + yourNumber);
            System.out.println("random number: " + random);
            System.out.println("tray");

            yourNumber = Integer.parseInt((reader.readLine()));
            random = firstNumberRandom + (int) (Math.random() * lastNumberRandom);

        }
        System.out.println("you win, i thought of the number " + random);

    }


}

