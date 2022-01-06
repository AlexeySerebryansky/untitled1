package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter your equation :  ");

        String line = READER.readLine().replace(" ", "");

        if (line.indexOf("-") != -1) {
            String[] items = line.split("[-]");
            double equationFirst = Double.parseDouble(items[0]) - Double.parseDouble(items[1]);
            System.out.println(equationFirst);
        } else if (line.indexOf("+") != -1) {
            String[] items = line.split("[+]");
            double equationFirst = Double.parseDouble(items[0]) + Double.parseDouble(items[1]);
            System.out.println(equationFirst);
        } else if (line.indexOf("*") != -1) {
            String[] items = line.split("[*]");
            double equationFirst = Double.parseDouble(items[0]) * Double.parseDouble(items[1]);
            System.out.println(equationFirst);
        } else if (line.indexOf("/") != -1) {
            String[] items = line.split("[/]");
            double equationFirst = Double.parseDouble(items[0]) / Double.parseDouble(items[1]);
            System.out.println(equationFirst);
        } else {
            System.out.println("you have not entered an operation");
        }
    }


}





