package com.hillel.classwork.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class castle {
    private static BufferedReader reader;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
       // boolean result = isHit(gun, startCastle, endCastle);

        int gun = Integer.parseInt((reader.readLine()));
        int startCastle = 1000;
        int endCastle = 1500;


    }
    private static boolean isHit (int gun, int startCastle, int endCastle) {
        if (gun < startCastle || gun > endCastle) {
            return false;
        } else {
            return true;
        }
    }





}
