package Seasson2;

public class Kata {

    public static int[][] matrixMultiplication(int[][] firstMatrix, int[][] secondMatrix) {
	int[][] result = new int[firstMatrix.length][secondMatrix[0].length];

	for (int row = 0; row < result.length; row++) {
	    for (int col = 0; col < result.length; col++) {
		result[row][col] = multiplyCell(firstMatrix, secondMatrix, row, col);
	    }
	}

	return result;
    }

    public static int multiplyCell(int[][] firstMatrix, int[][] secondMatrix, int row, int col) {
	int result = 0;

	for (int i = 0; i < secondMatrix.length; i++) {
	    result = result + firstMatrix[row][i] * secondMatrix[i][col];
	}
	return result;
    }
}