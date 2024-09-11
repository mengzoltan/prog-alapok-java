package com.training360.arrayofarrays;

public class MatrixO {

    private int[][] matrix;


    public MatrixO() {
        this.matrix = new int[3][3];
    }

    public MatrixO(int size) {
        this.matrix = new int[size][size];
    }

    public MatrixO(int row, int col) {
        this.matrix = new int[row][col];
    }

    public static void main(String[] args) {
        MatrixO matrixO = new MatrixO(4);
        matrixO.printMe();

        System.out.println();

        MatrixO matrix = new MatrixO();
        matrix.printMe();

        System.out.println();

        MatrixO customMatrix = new MatrixO(2, 5);
        customMatrix.printMe();

        customMatrix.fillMe(4);

        System.out.println();

        customMatrix.printMe();
    }

    public void printMe() {
        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                System.out.print(matrix[row][column]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void fillMe(int numb) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = numb;
            }
        }
    }
}
