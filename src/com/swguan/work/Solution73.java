package com.swguan.work;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * author: swGuan
 * 
 */
public class Solution73 {
	
	// hash set keep [i][j] = 0
	public void setZeroes(int[][] matrix) {
		Set<Integer> rows = new HashSet<Integer>();
	    Set<Integer> cols = new HashSet<Integer>();
	    
	    for(int i = 0; i < matrix.length; i++) {
	        for(int j = 0; j < matrix[0].length; j++) {
	            if(matrix[i][j] == 0) {
	            	rows.add(i);
	            	cols.add(j);
	            }
	        }
	    }
	    
	    for(int row : rows){
	        for(int j = 0; j < matrix[0].length; j++){
	            matrix[row][j] = 0;
	        } 
	    }
	    for(int col : cols){
	        for(int j = 0; j < matrix.length; j++){
	            matrix[j][col] = 0;
	        } 
	    }
	}
	
	// m*n
	public void setZeroesSlow(int[][] matrix) {
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
