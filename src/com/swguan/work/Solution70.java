package com.swguan.work;

/**
 * 
 * author: swGuan
 * 1. Basic n = 1 => 1; n = 2 => 2;
 * 2. when n > 2, the result => array[i-1] + array[i-2]
 * 3. n = 3 => 3; n = 4 => 5, n = 5 => 8 ...
 * 
 */
public class Solution70 {
		
	public int climbStairs(int n) {
        if(n <= 2) return n;
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 2;
        for(int i = 2; i < n; i++) {
        	array[i] = array[i-1] + array[i-2];
        }
        return array[n-1];
    }

}
