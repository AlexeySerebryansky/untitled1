package com.hillel.FirstCourse.classwork.homework.lesson13Family;

public class Mother extends Person{
    Mother(String name, int age){
        super(name, age);
    }

    public String toString() {
        return "Mother = " + this.name + " | Mother = " + this.age;
    }
}
