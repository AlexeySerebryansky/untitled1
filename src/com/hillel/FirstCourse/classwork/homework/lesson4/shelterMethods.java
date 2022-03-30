package com.hillel.FirstCourse.classwork.homework.lesson5;

public class shelterMethods {
     public static int eatingCats(int cat, int gramme, int dayInMonth, int nutrition) {
        return cat * gramme * dayInMonth * nutrition;

    }

     public static int eatingdogs(int dog, int gramme, int dayInMonth, int nutrition) {
        return dog * gramme * dayInMonth * nutrition;
    }

     public static int mastBeManey(int eatingCats, int eatingDogs,int gramme, int money) {
        return ((eatingCats + eatingDogs)/gramme) * money;
    }
}
