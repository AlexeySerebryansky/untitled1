package com.hillel.homework.lesson7;

public class UnluckyNumbers {
    public static void main(String[] args) {


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != 4 && j != 4)
                    System.out.println(i + "" + j);
            }
        }
    }
}
