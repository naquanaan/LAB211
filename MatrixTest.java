/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixtest;

import java.util.Scanner;

/**
 * MatrixTest class is a program for matrix operations (addition, subtraction, multiplication).
 * Author: WuanTun
 */
public class MatrixTest {

    /**
     * The main method to run the matrix calculator program
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Initialize the scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Create instances of InputMatrix and ManageMatrix classes for matrix operations
        InputMatrix inputMatrix = new InputMatrix();
        ManageMatrix manageMatrix = new ManageMatrix();

        // Initialize matrices for storing user input and results
        int[][] matrix1;
        int[][] matrix2;
        int[][] matrixResult;
        /**
         *
         */
        while (true) {
            System.out.println("=====Calculator program=====");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.println("Enter your choice");

            // Read the user's choice
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition");

                    matrix1 = InputMatrix.inputMatrix1();
                    // Input first matrix
                    matrix2 = InputMatrix.inputMatrix2();
                    // Input second matrix for addition
                    if (CheckConditionMatrix.Add(matrix1, matrix2)) {
                        matrixResult = ManageMatrix.additionMatrix(matrix1, matrix2);
                        // Perform addition
                        System.out.println("Matrix1 + Matrix2");
                        printMatrix(matrixResult);
                    } else {
                        System.out.println("Cannot add matrices. Incompatible dimensions.");
                    }
                    break;
                case 2:
                    System.out.println("Subtraction");
                    matrix1 = InputMatrix.inputMatrix1();
                    matrix2 = InputMatrix.inputMatrix2();
                    if (CheckConditionMatrix.Subtract(matrix1, matrix2)) {
                        matrixResult = ManageMatrix.subtractionMatrix(matrix1, matrix2);
                        System.out.println("Matrix1 - Matrix2");
                        // Perform subtraction
                        printMatrix(matrixResult);
                        matrixResult = ManageMatrix.subtractionMatrix(matrix2, matrix1);
                        System.out.println("Matrix2 - Matrix1");
                        printMatrix(matrixResult);
                    } else {
                        System.out.println("Cannot subtract matrices. Incompatible dimensions.");
                    }
                    break;
                case 3:
                    System.out.println("Multiplication");
                    matrix1 = InputMatrix.inputMatrix1();
                    matrix2 = InputMatrix.inputMatrix2();
                    boolean check1 = CheckConditionMatrix.Multiply(matrix1, matrix2);
                    if (check1) {
                        System.out.println("Matrix1 x Matrix2");
                        matrixResult = ManageMatrix.multiplicationMatrix(matrix1, matrix2);
                        printMatrix(matrixResult);
                    } else {
                        System.out.println("Cannot multiply matrices. Incompatible dimensions.");
                    }

                    boolean check2 = CheckConditionMatrix.MultiplyAfterSwap(matrix1, matrix2);
                    if (check2) {
                        System.out.println("Matrix2 x Matrix1");
                        matrixResult = ManageMatrix.multiplicationMatrix(matrix2, matrix1);
                        printMatrix(matrixResult);

                    } else {
                        System.out.println("Cannot multiply matrices. Incompatible dimensions.");
                    }

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    /**
     * Method to print a matrix
     *
     * @param matrix The matrix to be printed.
     */
    public static void printMatrix(int[][] matrix) {
        // Check if the matrix is null
        if (matrix == null) {
            System.out.println("Matrix is null.");
            //  print a message and return if matrix null
            return;
        }

        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
}
