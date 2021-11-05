package com.swguan.work;

/**
 * 
 * author: swGuan
 * 1. minus nums[i], and append roman[i]
 * 
 */
public class Solution12 {

	public String intToRoman(int num) {
		String[] roman = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] nums = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		StringBuilder s = new StringBuilder();
		int i = 0;
		while (num != 0) {
			if (num >= nums[i]) {
				num -= nums[i];
				s.append(roman[i]);
			} else {
				i++;
			}
		}
		return s.toString();
	}
    	
}
