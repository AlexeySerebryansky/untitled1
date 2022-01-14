package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Palindrome {


    public static void main(String[] args) throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));


        System.out.println("Enter how mach letters in your text");

        String[] palindrome = new String[Integer.parseInt(READER.readLine())];

        System.out.println("You entered: ");

        fillArrayPalindrome(palindrome);

        System.out.println("your text: " + Arrays.toString(palindrome));

        if (check(palindrome) == true) {
            System.out.println("palindrome");
        } else {
            System.out.println("non palindrome");
        }
        System.out.println(check(palindrome));


    }

    private static void fillArrayPalindrome(String[] palindrome) throws IOException {
        for (int i = 0; i < palindrome.length; i++) {
            palindrome[i] = String.valueOf(readLine());
        }
    }


    private static boolean check(String[] palindrome) {


        for (int i = 0; i < palindrome.length; i++) {
            for (int k = palindrome.length - 1; k == 0; k--) {
                return (palindrome[i] == palindrome[k]);

            }
        }
return true;
    }

    private static String readLine() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return String.valueOf(READER.readLine());
    }


}






