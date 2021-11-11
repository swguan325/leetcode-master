package com.swguan.work;

/**
 * 
 * author: swGuan
 * 1. use binary search
 * 
 */
public class Solution69 {
	
	public int mySqrt(int x) {
		if (x <= 1) return x;
        int left = 0, right = x;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x / mid >= mid) left = mid + 1;
            else right = mid;
        }
        return right - 1;
	}

	//走遍，效率差
	public int mySqrt2(int x) {
		int result = 0;
		int i = 1, j = 3;
		for (; i <= x; i += j) {
			result++;
			if (i > 1) {
				if (result == 46340) {
					break;
				}
				j += 2;
			}
		}
		return result;
	}

}
