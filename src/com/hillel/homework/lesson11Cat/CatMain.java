package com.hillel.homework.lesson11Cat;



public class CatMain {

    public static void main(String[] args) {


        Cat catMaineCoon = new Cat(9, 5, "Barsick", "Maine-Coon");
        Cat Sphinx = new Cat(9, 5, "Gosha", "Sphinx");

        Cat Eugeniy = new Cat("Eugeniy", 9);
        System.out.println(Eugeniy);


        System.out.println(catMaineCoon);
        System.out.println(Sphinx);

        if (catMaineCoon.equals(Sphinx)) {
            System.out.println("cats are the same age and weight");
        } else {
            System.out.println("cats have different ages and weights");
        }


    }
}
