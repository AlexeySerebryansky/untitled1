package com.hillel.FirstCourse.homework.lesson11Cat;



public class Cat {
    int weight;
    int age;
    String name;
    String breed;

    public Cat(int age, int weight, String name, String breed) {

        this.age = age;
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;

    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat cat) {
            return this.weight == cat.weight && this.age == cat.age;
        }

        return false;
    }

    public String toString() {
        return "Cat(" +
                "name=" + name +
                ", breed='" + breed + '\'' +
                ", weight='" + weight + '\'' +
                ", age='" + age + '\'' +
                ')';
    }


}
