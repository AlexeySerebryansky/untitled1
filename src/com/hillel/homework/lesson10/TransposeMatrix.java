package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) throws IOException {

        System.out.println("enter size your matrix");
        int line = reader();
        int column = reader();
        int[][] matrix = new int[line][column];


        fillMatrix(matrix);
        systemOutMatrix(matrix);
        transposeMatrix(line, column, matrix);

        System.out.println("Новая матрица");

        systemOutTransposeMatrix(line, column, matrix);


    }


    private static void fillMatrix(int[][] matrix) throws IOException {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("enter number");
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

    private static void transposeMatrix(int line, int column, int[][] matrix) {

        int[][]  transposeMatrix = new int[column][line];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
    }

    private static void systemOutTransposeMatrix(int line, int column, int[][] matrix) {

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("   " + matrix[i][j]);
            }
            System.out.println();
        }
    }


    private static int reader() throws IOException {
        BufferedReader READER = new BufferedReader((new InputStreamReader(System.in)));
        return Integer.parseInt(READER.readLine());
    }
}
