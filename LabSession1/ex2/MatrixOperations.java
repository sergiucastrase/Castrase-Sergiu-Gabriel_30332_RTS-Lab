package LabSession1.ex2;

public class MatrixOperations {
    public static void main(String[] args) {
        // Initialize the first matrix
        int[][] firstMatrix = {{2, 3, 1}, {7, 1, 6}, {9, 2, 4}};
        // Initialize the second matrix
        int[][] secondMatrix = {{8, 5, 3}, {3, 9, 2}, {2, 7, 3}};

        // Calculate the sum of the two matrices
        int[][] sumMatrix = addMatrices(firstMatrix, secondMatrix);
        // Calculate the product of the two matrices
        int[][] productMatrix = multiplyMatrices(firstMatrix, secondMatrix);

        // Display the sum of the matrices
        System.out.println("Sum of the two matrices:");
        printMatrix(sumMatrix);

        // Display the product of the matrices
        System.out.println("Product of the two matrices:");
        printMatrix(productMatrix);
    }

    // Add the two matrices
    public static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rows = firstMatrix.length;
        int columns = firstMatrix[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return result;
    }

    // Multiply the two matrices
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rows = firstMatrix.length;
        int columns = secondMatrix[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < firstMatrix[0].length; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return result;
    }

    // Print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
