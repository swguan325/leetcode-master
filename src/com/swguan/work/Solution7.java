package com.swguan.work;

/**
 * 
 * @author swGuan
 * 1. use integer divide 10 or mode 10
 * 2. check the next result is the same as previous
 * 
 */
public class Solution7 {

	public int reverse(int x) {
		int result = 0;
		while (x != 0) {
			int newResult = result * 10 + (x % 10);
			if ((newResult - (x % 10)) / 10 != result) {
				return 0;
			}
			result = newResult;
			x = x / 10;
		}
		return result;
    }
	
}