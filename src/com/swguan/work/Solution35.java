package com.swguan.work;

/**
* 
* author: swGuan
* 1. use binarySearch
* 2. compare nums[left] with target, ex,: 8 >= 7, means 7 should be locate at index left
* 
*/
public class Solution35 {
	
	public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
        	int mid = left + (right - left)/2;
        	if (nums[mid] == target) {
        		return mid;
        	}
        	if (nums[mid] < target) {
        		left = mid + 1;
        	} else if (target < nums[mid]) {
        		right = mid - 1;
        	}
        }
        if (nums[left] >= target) {
            return left;
        } else {
            return left + 1;
        }
    }
	
}
