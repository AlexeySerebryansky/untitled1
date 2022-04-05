package com.hillel.FirstCourse.homework.lesson13Family;

public class Father extends Person {
    Father(String name, int age){
        super(name, age);
    }

    public String toString() {
        return "Father = " + this.name + " | Age = " + this.age;
    }
}
