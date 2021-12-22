package com.hillel.homework.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExchangeOfValues {
    public static void main(String[] agrs) throws IOException {

        System.out.println("enter the value of variables a nad b: ");

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        int a = Integer.parseInt((reader.readLine()));
        int b = Integer.parseInt((reader.readLine()));

        System.out.println("a= " + a);
        System.out.println("b= "+ b);
    }
}
