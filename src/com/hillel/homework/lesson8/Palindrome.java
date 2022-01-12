package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class Palindrome {
    private static final BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

    public static void main(String[] args) throws IOException {


        System.out.println("Enter numbers, with stop to end");
        String[] palindrome = new String[Integer.parseInt(reader.readLine())];

        System.out.println("You entered: ");


        //if (check(palindrome) == 1) {
          //  System.out.println("palindrome");
        //} else {
          //  System.out.println("non palindrome");
        //}
        //System.out.println(check(palindrome));


    }


    private static int check(List<String> palindrome) {
        int checkPalindrome = 0;
        //for (int i = 0; i < palindrome.length; i++) {
          //  for (int k = palindrome.lenght - 1; k >= 0; k--) {
            //    if (palindrome.get(i) == palindrome.get(k)) ;
              // return checkPalindrome + 1;
            //}
        return checkPalindrome;
        }

    }






