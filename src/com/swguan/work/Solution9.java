package com.swguan.work;

/**
* 
* author: swGuan
* 1. after reverse the number, to check the number is the same or not
* 
*/
public class Solution9 {
	
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int result = 0, y = x;
		while (y != 0) {
			result = result * 10 + (y % 10);
			y = y / 10;
		}
		return x == result;
	}
	
}
