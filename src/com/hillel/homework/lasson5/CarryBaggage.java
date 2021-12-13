package com.hillel.homework.lasson5;

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
        System.out.println("your size is = " + payment(weight, height, depth));

        int carryOnBaggage = 44000;
        int bag = 46600;


        if (payment(weight,height,depth) == 0)System.out.println("you have not baggage");
        if (payment(weight, height, depth)>0 && payment(weight, height, depth)< carryOnBaggage) System.out.println("you have carry on baggage");

        else if (payment(weight, height, depth) > carryOnBaggage && payment(weight, height, depth) < bag)
            System.out.println("you have baggage ");

        if (payment(weight, height, depth) > bag) System.out.println("you mast pay extra");

    }

    public static int payment(int weight, int height, int depth) {

        return weight * height * depth;
    }

}
