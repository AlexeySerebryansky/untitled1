package com.hillel.FirstCourse.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swetch {
    public static void main(String[] agrs) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("inter a number : ");

        int number = Integer.parseInt(reader.readLine());

        System.out.println("number" + number);

        switch (number) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;

        }
    }
}
