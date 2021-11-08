package com.swguan.work;

/**
 * 
 * author: swGuan
 * 1. the result of the [m][n] = [m-1][n] + [m][n-1]
 * 2. example 3 * 2 :
 *    1, 1
 *    1, 2
 *    1, 3
 * 
 */
public class Solution62 {

	public int uniquePaths(int m, int n) {
		if (m == 1 || n == 1)
			return 1;
		int[][] pathMatrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0) {
					pathMatrix[i][j] = 1;
				} else {
					pathMatrix[i][j] = pathMatrix[i - 1][j] + pathMatrix[i][j - 1];
				}
			}
		}
		return pathMatrix[m - 1][n - 1];
	}

	// recurcive go around => slow 
	public int uniquePathsCount(int m, int n, int maxM, int maxN, int count) {
		if (maxM - 1 == m && maxN - 1 == n) {
			return ++count;
		}
		if (maxM == m || maxN == n) {
			return count;
		}
		count = uniquePathsCount(m, n + 1, maxM, maxN, count);
		count = uniquePathsCount(m + 1, n, maxM, maxN, count);
		return count;
	}

}
