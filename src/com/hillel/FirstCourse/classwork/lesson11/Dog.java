package com.hillel.FirstCourse.classwork.lesson11;

public class Dog {

    int age;
    String size;
    String color;
    String breed;

    public void run() {
        System.out.println("dog can run");
    }

    public Dog() {
        System.out.println("Dog has been create");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
            return this.size.equals(dog.size) && this.age == dog.age;
        }

        return false;
    }

    public Dog(int age, String size, String color, String breed) {

        this.age = age;
        this.size = size;
        this.color = color;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog(" +
                "age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ')';
    }

}
