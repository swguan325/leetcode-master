package com.swguan.work;

import java.util.LinkedList;
import java.util.List;

/**
* 
* author: swGuan
* 1. the sequence of the matix is d,s,w,a
* 2. when count is 0, means touch the last one, change direction
* 
*/
public class Solution54 {
	

    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> outputs = new LinkedList<>();
    	int wLen = matrix[0].length;
    	int Hen = matrix.length;
		int i = 0, j = 0, d = 0, count = wLen;
		char[] dirs = new char[] { 'd', 's', 'w', 'a' };
    	while (true) {
    		if (count == 0) {
    			break;
    		} else {
    			outputs.add(matrix[i][j]);
				count--;
    			
				switch (dirs[d]) {
				case 'd':
					if (count == 0) {
						i++;
						d++;
						
						Hen--;
						count = Hen;
					} else {
						j++;
					}
					break;
				case 's':
					if (count == 0) {
						j--;
						d++;
						
						wLen--;
						count = wLen;
					} else {
						i++;
					}
					break;
				case 'w':
					if (count == 0) {
						i--;
						d++;

						Hen--;
						count = Hen;
					} else {
						j--;
					}
					break;
				case 'a':
					if (count == 0) {
						j++;
						d = 0;

						wLen--;
						count = wLen;
					} else {
						i--;
					}
					break;
				}
    		}    		
    	}    	
    	return outputs;
    }
	
}
