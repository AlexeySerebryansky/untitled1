package com.hillel.FirstCourse.classwork.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class doWhile {
    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int stop = Integer.parseInt((reader.readLine()));

        int i = 10;
        do {
            System.out.println("до взрыва осталось  " + i);
            Thread.sleep(1000);
            i--;

            {
                if (stop == 1234) break;
            }


        } while (i > 0);
        System.out.println("BOOM!");

    }
}
