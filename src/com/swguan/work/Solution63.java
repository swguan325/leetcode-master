package com.swguan.work;

/**
 * 
 * author: swGuan 
 * 1. the result of the [m][n] = [m-1][n] + [m][n-1]
 * 2. when [m][n] is 1 => set 0
 * 3. when [0][n] is 0, the [0][n+1] will be 0
 * 4. when [m][0] is 0, the [m+1][0] will be 0
 * 
 */
public class Solution63 {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid[0][0] == 1)
			return 0;
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (obstacleGrid[i][j] == 1) {
					obstacleGrid[i][j] = 0;
					continue;
				}
				if (i == 0 && j == 0) {
					obstacleGrid[i][j] = 1;
				} else if (i == 0) {
					obstacleGrid[i][j] = obstacleGrid[i][j - 1];
				} else if (j == 0) {
					obstacleGrid[i][j] = obstacleGrid[i - 1][j];
				} else {
					obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
				}
			}
		}
		return obstacleGrid[m - 1][n - 1];
	}

}
