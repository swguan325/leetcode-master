package com.swguan.work;

/**
 * 
 * author: swGuan
 * 1. check the string is startwith the romans array
 */
public class Solution13 {

	public int romanToInt(String s) {
		String romans[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int value[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		int idx = 0, result = 0;
		while (!s.isEmpty()) {
			if (s.startsWith(romans[idx])) {
				result += value[idx];

				s = s.substring(romans[idx].length(), s.length());
			} else {
				idx++;
			}
		}

		return result;
	}

}
