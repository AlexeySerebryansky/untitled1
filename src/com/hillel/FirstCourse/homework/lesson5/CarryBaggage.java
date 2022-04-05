package com.hillel.FirstCourse.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarryBaggage {


    public static void main(String[] agrs) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("inter size your baggage (weight, height, depth)  : ");


        int width = Integer.parseInt((reader.readLine()));
        int height = Integer.parseInt((reader.readLine()));
        int depth = Integer.parseInt((reader.readLine()));





    }

    private static void carryOnBaggage(int width, int height, int depth) {
        int widthCarryOnBaggage = 20;
        int heightCarryOnBaggage = 40;
        int depthCarryOnBaggage = 55;

        int widthBaggage= 22;
        int heightBaggage= 53;
        int depthBaggage= 40;

        if (width<= widthCarryOnBaggage && height<=heightCarryOnBaggage && depth<=depthCarryOnBaggage)
            System.out.println("you have carry-on baggage, have a good flight");
       // if(width > widthCarryOnBaggage && )

    }


}
