package com.hillel.classwork.lasson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ifelse {
    public static void main(String[] agrs) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("inter a number:");

        int number = Integer.parseInt((reader.readLine()));
        System.out.println("number" + number);

        if (number > 20 && number < 30) {
            System.out.println("your number is between 20 and 30");
        } else if (number > 10 && number < 20) {
            System.out.println("between 10 and 20");
        } else {
            System.out.println("else");
        }
    }
}
