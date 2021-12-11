package com.hillel.classwork.lesson4;

public class Salary {
    public static void main(String[] agrs) {
        int First = 3000;
        int Second = 4500;
        int Third = 5800;

        // 120-month in 10 year

        int a = First * 120;
        int b = Second * 120;
        int c = Third * 120;
        System.out.println(" 1) " + a + " 2) " + b + " 3) " + c);

        //0.005 - tax
        double d = 0.005;

        System.out.println((a * d) + (b * d) + (c * d));


        System.out.println(((a * d) + (b * d) + (c * d)) / 10);


    }
}
