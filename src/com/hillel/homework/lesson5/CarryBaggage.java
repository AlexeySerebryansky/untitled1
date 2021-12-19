package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarryBaggage {


    public static void main(String[] agrs) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("inter size your baggage (weight, height, depth)  : ");



        int weight = Integer.parseInt((reader.readLine()));
        int height = Integer.parseInt((reader.readLine()));
        int depth = Integer.parseInt((reader.readLine()));
        int methods = payment(weight,height,depth);
        System.out.println("your size is = " + methods);

        int carryOnBaggage = 44000;
        int bag = 46600;


        if (methods == 0)System.out.println("you have not baggage");
        if (methods>0 && methods< carryOnBaggage) System.out.println("you have carry on baggage");
        if (methods > carryOnBaggage && methods < bag) System.out.println("you have baggage ");
        if (methods > bag) System.out.println("you mast pay extra");

    }

    public static int payment(int weight, int height, int depth) {

        return weight + height + depth;
    }

}
