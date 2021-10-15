package com.swguan.work;

/**
 * 
 * author: swGuan
 * 1. check the left and the right index
 * 2. once the last number is grater then current number, skip it
 * 
 */
public class Solution11 {

	public int maxArea(int[] height) {
		int left = 0, right = height.length - 1, max = 0;
		int lastLeft = 0, lastRight = 0;
		int thisLeft = 0, thisRight = 0;

		while (left < right) {
			thisLeft = height[left];
			thisRight = height[right];
			if (thisRight > lastRight || thisLeft > lastLeft) {
				max = Math.max(max, (Math.min(thisLeft, thisRight) * (right - left)));

				lastRight = thisRight;
				lastLeft = thisLeft;
			}

			if (thisLeft < thisRight) {
				left++;
			} else {
				right--;
			}
		}
		return max;
	}
	
}
