package com.hillel.classwork.lesson6;

public class Sum {
    public static void main(String[] args) {


        int number1 = 1;
        int number2 = 2;
        Double result = sum (number1, number2);
        System.out.println(result);

        System.out.println(sum (4,5));

        System.out.println(sum(4000L , 5l));

        System.out.println(sum(4.5, 500.0));

    }
    private static double  sum (int n1, int n2){
        return  n1 + n2;

    }
    public static double sum (long n1, long n2){
        return n1+n2;

    }
    private static double sum(double d1, double d2){
        return d1+d2;
    }

}
