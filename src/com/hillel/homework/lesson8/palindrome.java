package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class palindrome {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter text, with stop to end");
        String[] palindrome = createAndFillPalindrome();
        System.out.println("your array: " + Arrays.toString(palindrome));

        if (check(palindrome)) {
            System.out.println("palindrome");
        } else {
            System.out.println("now palindrome");
        }
    }


    private static String[] createAndFillPalindrome() throws IOException {
        List<String> palindrome = new ArrayList<>();
        while (true) {
            String input = reader();
            if (input.equals("stop")) {
                break;
            }
            palindrome.add(input);
        }
        return palindrome.toArray(new String[0]);
    }


    private static boolean check(String[] palindrome) {

        int count = 0;
        for (int i = 0; i < palindrome.length; i++) {
            if (palindrome[i].charAt(0) == palindrome[palindrome.length - 1 - i].charAt(0)) {
                count++;
            }
        }

        if (count == palindrome.length) return true;
        return false;
    }


    private static String reader() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return String.valueOf(READER.readLine());
    }


}
