/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixtest;

import java.util.Scanner;

/**
 * InputMatrix is a utility class that provides a method to input a 2D matrix based on user input.
 * 
 * @author WuanTun
 */
public class InputMatrix {
    // Method to input the first matrix

    /**
     * Inputs the first matrix based on user input.
     *
     * @return The matrix1 after user input.
     */
    public static int[][] inputMatrix1() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the number of rows and columns for Matrix 1
        System.out.print("Enter the number of rows for Matrix 1: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix 1: ");
        int columns = scanner.nextInt();

        // Create a 2D array to store Matrix 1
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter values for Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Prompt the user to input individual elements of Matrix 1
                System.out.print("Matrix1[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        // Return the user-input Matrix 1
        return matrix;
    }

    /**
     * Inputs the second matrix based on user input.
     *
     * @return The matrix2 after user input.
     */
    public static int[][] inputMatrix2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Matrix 2: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix 2: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter values for Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matrix2[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
