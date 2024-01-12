/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixtest;

/**
 * CheckConditionMatrix is a utility class that provides methods to check if specific matrix operations are possible based on the dimensions of the input matrices.
 * 
 * @author WuanTun
 */
public class CheckConditionMatrix {
   /**
 * Checks if it is possible to add two matrices by comparing their dimensions.
 * @param matrix1 The first matrix.
 * @param matrix2 The second matrix.
 * @return True if addition is possible, false otherwise.
 */
public static boolean Add(int[][] matrix1, int[][] matrix2) {
    return (matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length);
}

/**
 * Checks if it is possible to subtract one matrix from another by comparing their dimensions.
 * @param matrix1 The first matrix.
 * @param matrix2 The second matrix.
 * @return True if subtraction is possible, false otherwise.
 */
public static boolean Subtract(int[][] matrix1, int[][] matrix2) {
    return (matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length);
}

/**
 * Checks if it is possible to multiply two matrices by comparing their dimensions.
 * @param matrix1 The first matrix.
 * @param matrix2 The second matrix.
 * @return True if multiplication is possible, false otherwise.
 */
public static boolean Multiply(int[][] matrix1, int[][] matrix2) {
    return matrix1[0].length == matrix2.length;
}

/**
 * Checks if it is possible to multiply two matrices after swapping their positions.
 * @param matrix1 The first matrix.
 * @param matrix2 The second matrix.
 * @return True if multiplication is possible after swapping, false otherwise.
 */
public static boolean MultiplyAfterSwap(int[][] matrix1, int[][] matrix2) {
    return matrix2[0].length == matrix1.length;
}

    
}
