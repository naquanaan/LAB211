/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

/**
 * 
 * A class for inputting 2D matrices based on user input.
 * @author ADMIN
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
 * Prompt the user to input a 2D matrix (Matrix 2) based on the specified operation
 * and validate the matrix dimensions for compatibility with Matrix 1.
 *
 * @param operation The type of operation (1 for addition, 2 for subtraction, 3 for multiplication).
 * @param matrix1 The first matrix for which compatibility with Matrix 2 is checked.
 * @return A 2D array representing the user-input Matrix 2.
 */
    public static int[][] inputMatrix2(int operation, int[][] matrix1) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt the user to input the number of rows and columns for Matrix 2
            System.out.print("Enter the number of rows for Matrix 2: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns for Matrix 2: ");
            int columns = scanner.nextInt();

            if ((operation == 1 || operation == 2) && (rows != matrix1.length || columns != matrix1[0].length)) {
                System.out.println("Matrix 2 must have the same dimensions as Matrix 1.");
                System.out.println("Please enter Matrix 2 again.");
            } else if (operation == 3 && columns != matrix1.length) {
                System.out.println("Column 2 must equal the rows in Matrix 1 for multiplication.");
                System.out.println("Please enter Matrix 2 again.");
            } else {
                int[][] matrix = new int[rows][columns];
                System.out.println("Enter values for Matrix 2:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print("Matrix2[" + (i + 1) + "][" + (j + 1) + "]: ");
                        matrix[i][j] = scanner.nextInt();
                    }
                }
                return matrix; // Return the user-input Matrix 2
            }
        }
    }
}
