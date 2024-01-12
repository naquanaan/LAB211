/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixtest;

/**
 * This class provides methods for managing matrices, including addition, subtraction, and multiplication.
 * 
 * @author WuanTun
 */
public class ManageMatrix {
    // Method to perform matrix addition
    /**
     * Performs matrix addition of two input matrices.
     *
     * @param matrix1 The first input matrix.
     * @param matrix2 The second input matrix.
     * @return The result of matrix addition.
     */
    public static int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // Return the result of matrix addition
        return result;
    }

    // Method to perform matrix subtraction
    /**
     * Performs matrix subtraction of two input matrices.
     *
     * @param matrix1 The first input matrix.
     * @param matrix2 The second input matrix.
     * @return The result of matrix subtraction.
     */
    public static int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        // Return the result of matrix subtraction
        return result;
    }

    // Method to perform matrix multiplication
    /**
     * Performs matrix multiplication of two input matrices.
     *
     * @param matrix1 The first input matrix.
     * @param matrix2 The second input matrix.
     * @return The result of matrix multiplication.
     */
    public static int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int rowsmatrix1 = matrix1.length;
        int columnsmatrix1 = matrix1[0].length;
        int columnsmatrix2 = matrix2[0].length;

        int[][] result = new int[rowsmatrix1][columnsmatrix2];
        // Perform matrix multiplication using nested loops
        for (int i = 0; i < rowsmatrix1; i++) {
            for (int j = 0; j < columnsmatrix2; j++) {
                for (int k = 0; k < columnsmatrix1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        // Return the result of matrix multiplication
        return result;
    }
}
