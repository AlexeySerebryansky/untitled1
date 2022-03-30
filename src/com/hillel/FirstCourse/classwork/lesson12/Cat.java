package com.hillel.FirstCourse.classwork.lesson12;

public class Cat {

    int weight;
    int strength;
    int age;


    private Cat(int weight, int strength, int age) {
        Cat barsic = new Cat(5, 5, 5);
        Cat mikle = new Cat(1, 3, 9);
    }

    private int catHP() {
        return ((this.weight * this.strength) / this.age);
    }

    public void fight(Cat cat){
        if (this.catHP() > cat.catHP()){
            System.out.println("win " );
        }else {
            System.out.println();
        }
    }


}
