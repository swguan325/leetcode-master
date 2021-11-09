package com.swguan.work;

/**
 * 
 * author: swGuan
 * 1. once result > 0, means other value is 0
 * 
 */
public class Solution66 {

	public int[] plusOne(int[] digits) {
		int result = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			result += digits[i];
			digits[i] = result % 10;
			result = result / 10;
		}
		if (result > 0) {
			digits = new int[digits.length + 1];
	        digits[0] = 1;
	        return digits;
		} else {
			return digits;
		}
	}

}
