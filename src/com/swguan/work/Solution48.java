package com.swguan.work;

/**
* 
* author: swGuan
* 1. use recursive
* 2. when matrix[i][j] is not used, the next value need to swap is [length - j][i],
*    the result will recurse to the starter => go to the next loop
* 3. use used to mark the index is checked
* 
*/
public class Solution48 {
	
	public void rotate(int[][] matrix) {
		int len = matrix.length;
		boolean[][] used = new boolean[len][len];
		for (int m = 0; m < len; m++) {
			for (int n = 0; n < len / 2; n++) {
				if (used[m][n]) continue;
				recursiveRotate(m, n, matrix, used, len - 1);
			}
		}
	}

	public void recursiveRotate(int i, int j, int[][] matrix, boolean[][] used, int length) {
		used[i][j] = true;
		int jump = length - j;
		if (used[jump][i]) {
			return;
		}
		int temp = matrix[jump][i];
		matrix[jump][i] = matrix[i][j];
		matrix[i][j] = temp;
		recursiveRotate(jump, i, matrix, used, length);
	}
	
}
