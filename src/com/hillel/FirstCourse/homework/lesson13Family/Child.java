package com.hillel.FirstCourse.homework.lesson13Family;

public class Child extends Person{
    Child(String name, Father father, Mother mother){
        super(name, father, mother);
    }

    public String toString() {
        return "Name = " + name + " | Father = " + father.name + " | Mother = " + mother.name;
    }
}
