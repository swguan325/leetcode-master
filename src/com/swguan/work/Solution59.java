package com.swguan.work;

/**
* 
* author: swGuan
* 1. the sequence of the matix is d,s,a,w
* 2. when count is 0, means touch the last one, change direction
* 
*/
public class Solution59 {

    public int[][] generateMatrix(int n) {
    	int[][] result = new int[n][n];

    	int i = 0, j = 0, d = 0;
		char[] dirs = new char[] { 'd', 's', 'a', 'w' };
		int max = n * n;
        for (int nums = 1, count = n; nums <= max; nums++) {
        	result[i][j] = nums;
        	count--;
        	
        	switch (dirs[d]) {
        	case 'd':
        		if (count == 0) {
        			i++;
        			d++;
        			
        			count = --n;
        		} else {
        			j++;
        		}        		
        		break;
        	case 's':
        		if (count == 0) {
        			j--;
        			d++;
        			
        			count = n;
        		} else {
        			i++;
        		}        		
        		break;
        	case 'a':
        		if (count == 0) {
        			i--;
        			d++;
        			
        			count = --n;
        		} else {
        			j--;
        		}        		
        		break;
        	case 'w':
        		if (count == 0) {
        			j++;
        			d = 0;
        			
        			count = n;
        		} else {
        			i--;
        		}        		
        		break;
        	
        	}
        }
        return result;
    }
	
}
