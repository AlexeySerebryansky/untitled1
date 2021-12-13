package com.hillel.homework.lasson4;

public class shelter {
    public static void main(String[] agrs){

        int dog= 24;
        int cat = 8;
        int money = 2;
        int nutrition = 3;
        int gramme = 50;
        int dayInMonth= 31;
        System.out.println("you have 24 dogs and 8 cats");
        System.out.println(grammeInMonth(gramme, nutrition));
    }
    private static int grammeInMonth(int gramme, int nutrition){
        return gramme*nutrition*30;
    }
}
