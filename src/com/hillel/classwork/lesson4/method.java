package com.hillel.classwork.lesson4;

public class method {
    public static void main(String[] agrs) {
        printMassage();
       int namber =  generateRandom();
       System.out.println(namber);
       int randomInt = generateRandom(10, 50);
       System.out.println(randomInt);


    }

    public static void printMassage() {
        System.out.println("massage");
    }
    public static int generateRandom(){
        return (int) (Math.random() * 100);
    }
    public  static int generateRandom(int min, int max){

        return (int) (Math.random()* (max-min) + min);

    }


}
