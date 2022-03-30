package com.hillel.FirstCourse.classwork.homework.lesson13Family;

public class Person {

    String name;
    int age;
    Father father;
    Mother mother;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    Person(String name, Father father, Mother mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }



}

