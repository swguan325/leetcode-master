package com.swguan.work;

/**
* 
* author: swGuan
* 1. nums can not be all the smae, should be [5, 8, 8, 8] => 8
* 2. find the left index, when the left is smaller then target, left + 1
* 3. find the right index, when the right is bigger then target, right - 1
* 
*/
public class Solution34 {
	
	public int[] searchRange(int[] nums, int target) {
		int len = nums.length - 1;
		int left = binarySearchLeft(nums, target, 0, len);
		if (left == nums.length || nums[left] != target)
			return new int[] { -1, -1 };
		int right = binarySearchRight(nums, target, left, len);
		return new int[] { left, right };
	}
	// find the left one
	public int binarySearchLeft(int[] nums, int target, int left, int right) {
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[left] == target) {
				return left;
			}
			if (nums[mid] < target) {
				left = mid + 1;	
			}
			else {
				right = mid - 1;
			}
		}
		return left;
	}
	// find the right one
	public int binarySearchRight(int[] nums, int target, int left, int right) {
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[right] == target) {
				return right;
			}
			if (target < nums[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;	
			}
		}
		return right;
	}
	
}
