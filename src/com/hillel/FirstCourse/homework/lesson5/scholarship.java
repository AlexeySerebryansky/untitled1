package com.hillel.FirstCourse.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class scholarship {
    public static void main(String[] agrs) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("enter your grades in mathematics, physics, geography, history and biology : ");

        int Mathematics = Integer.parseInt((reader.readLine()));
        int Physic = Integer.parseInt((reader.readLine()));
        int History = Integer.parseInt((reader.readLine()));
        int Geography = Integer.parseInt((reader.readLine()));
        int Biologist = Integer.parseInt((reader.readLine()));
        int AllSubject = 5;

        int TotalSubject = averageScore(Mathematics, Physic, History, Geography, Biologist);
        int MiddleSubject = middleItem(TotalSubject, AllSubject);


        System.out.println("your total items : " + TotalSubject);
        System.out.println("your middle items : " + MiddleSubject);

        if (MiddleSubject > 0 && MiddleSubject <= 3) System.out.println("you may be expelled");

        if (MiddleSubject > 3 && MiddleSubject < 8) System.out.println("you can`t get scholarship");

        if (MiddleSubject >= 8 && MiddleSubject < 10) System.out.println("you can get scholarship");

        if (MiddleSubject >= 10 && MiddleSubject <= 12) System.out.println("you can get an increased scholarship");

        if (MiddleSubject > 12) System.out.println("you`re lying");


    }

    private static int averageScore(int Mathematics, int Physic, int History, int Geography, int Biologist) {

        return (Mathematics + Physic + History + Geography + Biologist);
    }

    private static int middleItem(int TotaleSubject, int AllSubject) {
        return TotaleSubject / AllSubject;

    }


}


