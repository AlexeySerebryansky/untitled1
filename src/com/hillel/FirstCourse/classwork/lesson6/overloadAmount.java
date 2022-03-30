package com.hillel.FirstCourse.classwork.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class overloadAmount {
    public static void main (String[] agrs) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String test = bufferedReader.readLine();
        String test2 = bufferedReader.readLine();

        printConcatenation(test, test2);
        printConcatenation("test" , test);



    }
    private static void printConcatenation (String s1, String s2){
        System.out.println(s1+s2);

    }
    private static void printConcatenation (String str, int number){
        System.out.println(str + number);

    }

}
