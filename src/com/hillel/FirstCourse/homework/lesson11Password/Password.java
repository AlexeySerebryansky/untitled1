package com.hillel.FirstCourse.homework.lesson11Password;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Password {


    private static final Random Random = new Random();
    private static final char[] symbols = "abcdefghijklmnopqrstuvwxyzABCDEFHGJKLMNOPQRSTUVWXYZ1234567890_".toCharArray();
    private static final int Length = symbols.length;


    public static char getRandomChar() {
        return symbols[Random.nextInt(Length)];
    }


    public static String Generation(int lengthPassword) {
        if (lengthPassword < 8 || lengthPassword > 12) {
            System.out.println("please enter a password length between 8 and 12 characters");
            return "";
        }
        String[] password = new String[lengthPassword];
        for (int i = 0; i < lengthPassword; i++) {
            password[i] = Character.toString(getRandomChar());

        }

        return String.join("", password);
    }


    private static int reader() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return Integer.parseInt(READER.readLine());
    }


    public static void main(String[] args) throws IOException {
        int lengthPassword = 0;
        do {
            System.out.println("please enter a password length between 8 and 12 characters");
            lengthPassword = reader();
        } while (lengthPassword < 8 || lengthPassword > 12);


        System.out.println(Generation(lengthPassword));

    }


}
