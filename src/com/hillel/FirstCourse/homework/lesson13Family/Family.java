package com.hillel.FirstCourse.homework.lesson13Family;

public class Family {
    void family() {
        Person father = new Father("Sergey", 40);
        Person mother = new Mother("Nina", 29);
        Person child = new Child("Alexey", (Father) father, (Mother) mother);
    }

        public static void main(String[] args) {

            Family start = new Family();
            start.family();
            System.out.println();

        }
}
