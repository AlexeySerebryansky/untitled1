package com.hillel.FirstCourse.classwork.lesson12;

public class PersonControl {

    public static void main(String[] args) {

        Person person = new Person("Alexey", 18);

        System.out.println(person);
        System.out.println(person.getName());
        person.setAge(43);
        System.out.println(person.getAge());

    }


}
