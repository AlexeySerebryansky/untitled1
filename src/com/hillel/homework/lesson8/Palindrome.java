package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Palindrome {
    private static final BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

    public static void main(String[] args) throws IOException {


        System.out.println("Enter numbers, with stop to end");
        List<String> palindrome = new ArrayList<>();
        while (true) {
            String input = reader.readLine();
            //  if (input = stop) {
                break;
            }
          //  palindrome.add(input);
        }
     //   System.out.println("You entered: ");


      //  if (check(palindrome) == 1) {
           // System.out.println("palindrome");
       // } else {
            //System.out.println("non palindrome");
        }
        //System.out.println(check(palindrome));


    //}


    //private static int check(List<String> palindrome) {
        //int checkPalindrome = 0;
       // for (int i = 0; i < palindrome.length; i++) {
        //     for (int k = palindrome.lenght - 1; k >= 0; k--) {
       //         if (palindrome.get(i) == palindrome.get(k)) ;
       //         checkPalindrome = 1;
      //      }
    //    }
    //    return checkPalindrome;
   // }


//}



