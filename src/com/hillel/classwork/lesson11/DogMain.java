package com.hillel.classwork.lesson11;

public class DogMain {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.age = 3;
        dog.breed = "pit bill";
        dog.color = "black";
        dog.size = "largest";


        System.out.println(dog.breed);
        System.out.println(dog.size);
        System.out.println(dog.age);
        System.out.println(dog.color);

        dog.run();


        Dog dog1 = new Dog();
        dog1.age = 5;
        dog1.breed = "Mastif";
        dog1.color = "white";
        dog1.size = "big";


        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);

        dog.run();

        System.out.println(dog.equals(dog1));

        Dog dog3 = new Dog(6, "small", "black", "Chow Chow");

        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog3);


    }
}
