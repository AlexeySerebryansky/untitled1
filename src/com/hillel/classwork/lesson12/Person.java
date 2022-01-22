package com.hillel.classwork.lesson12;


class Person {

    private static final String DEFAULT_NAME = "Unknown";

    private final String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public Person(int age) {
        this.name = DEFAULT_NAME;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        secretAction();
    }

    private void secretAction() {
        System.out.println("secret");
    }

    public String toString() {
        return "Person name= " + name + ", age= " + age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
