package com.hillel.FirstCourse.classwork.homework.lesson3;

import java.util.Scanner;

public class equation {
    public static void main(String[] agrs) {


        System.out.println("enter equation (a,b,c) for equation :");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        System.out.println((Math.abs(a - b) / Math.pow(a + b, 3)) - Math.sqrt(c));


    }


}
