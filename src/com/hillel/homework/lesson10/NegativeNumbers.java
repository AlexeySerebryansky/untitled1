package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NegativeNumbers {
    public static void main(String[] args) throws IOException {
        System.out.println("enter size your matrix");
        System.out.println("enter how many line: ");
        int line = reader();
        System.out.println("enter how many column: ");
        int column = reader();
        int[][] matrix = new int[line][column];
        fillMatrix(matrix);

        systemOutMatrix(matrix);

        check(matrix);




    }

    private static void fillMatrix(int[][] matrix) throws IOException {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("enter number: " + (i+1) + "  " + (j+1) + ";  ");
                matrix[i][j] = reader();
            }
        }
    }

    private static void systemOutMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("   " + matrix[i][j]);
            }
            System.out.println();
        }
    }


    public static void check(int[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.print("line: " + (i+1) + " - " + "column: " + (j+1) + " ;   ");
                }
            }
        }
        System.out.println();
    }

    private static int reader() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return Integer.parseInt(READER.readLine());
    }


}
