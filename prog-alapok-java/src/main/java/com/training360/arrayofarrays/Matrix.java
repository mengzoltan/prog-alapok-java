package com.training360.arrayofarrays;

public class Matrix {

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        /*
        0 0 0
        0 0 0
        0 0 0
         */
        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                System.out.print(matrix[row][column]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
