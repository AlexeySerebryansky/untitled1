package com.hillel.FirstCourse.homework.lesson13;


public class HundredPerson {
    int age;
    int weight;
    int height;
    String name;
    String surname;


    public HundredPerson(double ageRandom, double weightRandom, double heightRandom, String name, String surname) {
        this.age = (int) ageRandom;
        this.weight = (int) weightRandom;
        this.height = (int) heightRandom;
        this.name = name;
        this.surname = surname;

    }






    @Override
    public String toString() {
        return
                "surname= " + surname +
                        ",   name=" + name +
                        ",   age=" + age +
                        ",   height=" + height + '\'' +
                        ",   weight='" + weight + '\'';
    }


}
