package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Palindrome {
    private static final BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));

    public static void main(String[] args) throws IOException {


        System.out.println("set the length of the array");
       String[] palindrome = new String[Integer.parseInt(READER.readLine())];
        System.out.println("Created an array of length: " + palindrome.length);
        fillingArray(palindrome);
        System.out.println(Arrays.toString(palindrome));


        if (check(palindrome) == 1) {
            System.out.println("palindrome");
        } else {
            System.out.println("non palindrome");
        }
        System.out.println(check(palindrome));


    }

    private static String fillingArray(String[] palindrome) throws IOException {


        for (int i = 0; i < palindrome.length; i++) {

            palindrome[i] = READER.readLine();
        }
        return String.valueOf(0);
    }

    private static int check(String[] palindrome) {
        int checkPalindrome = 0;
        for (int i = 0; i < palindrome.length; i++) {
            for (int k = palindrome.length-1 ; k >= 0; k--) {
                if (palindrome[i] == palindrome[k] ) ;
                   checkPalindrome = 1;
            }
        }
        return checkPalindrome;
    }


}



