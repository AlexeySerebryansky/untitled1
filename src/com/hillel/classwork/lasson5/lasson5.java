package com.hillel.classwork.lasson5;

public class lasson5 {
    public static void main(String[] agrs) {


        int lenght = 2;
        int width = 3;
        int height = 4;
        int density = 58;
        System.out.println("max loading = " + calculateVolume(lenght, width, height, density));


    }


    public static int calculateVolume(int lenght, int widht, int height, int density) {
        int volume = lenght * widht * height * density;

        return volume;
    }


}
