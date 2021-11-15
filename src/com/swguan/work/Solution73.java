package com.swguan.work;

/**
 * 
 * author: swGuan
 * 
 */
public class Solution73 {
			
	public void setZeroes(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		boolean[][] checked = new boolean[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0 && !checked[i][j]) {
					resetRows(j, rows, matrix, checked);
					resetCols(i, cols, matrix, checked);
				}
			}
		}
	}

	public void resetRows(int j, int rowMax, int[][] matrix, boolean[][] checked) {
		for (int m = 0; m < rowMax; m++) {
			if (matrix[m][j] != 0)
				checked[m][j] = true;
			matrix[m][j] = 0;
		}
	}

	public void resetCols(int i, int colMax, int[][] matrix, boolean[][] checked) {
		for (int n = 0; n < colMax; n++) {
			if (matrix[i][n] != 0)
				checked[i][n] = true;
			matrix[i][n] = 0;
		}
	}

}
