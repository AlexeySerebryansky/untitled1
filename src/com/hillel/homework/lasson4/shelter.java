package com.hillel.homework.lasson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

import static com.hillel.homework.lasson5.shelterMethods.*;

public class shelter {


    public static void main(String[] agrs) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("how many days in a month : ");


        int dog = 24;
        int cat = 8;
        int money = 2;
        int nutrition = 3;
        int gramme = 50;
        int dayInMonth = Integer.parseInt((reader.readLine()));

        int eatingCats = eatingCats(cat, gramme, dayInMonth, nutrition);
        int eatingDogs = eatingdogs(dog, gramme, dayInMonth, nutrition);
        int mustBeManey = mastBeManey(eatingCats, eatingDogs,gramme, money);

        System.out.println("you have 24 dogs and 8 cats. A portion of lunch for each animal is 50 grams and costs $ 2. Animals eat 3 times a day");
        System.out.println("eating cats in month : " + eatingCats + " gramme");
        System.out.println("eating dogs in month : " + eatingDogs + " gramme");
        System.out.println("the maintenance of the shelter is worth : " + mustBeManey +" $");


    }


}
