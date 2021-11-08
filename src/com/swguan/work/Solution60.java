package com.swguan.work;

/**
 * 
 * author: swGuan
 * 1. use nextPermutation
 * 2. find which index [i] is smaller than [i + 1]
 * 3. find which index [j] is bigger than [i] 
 */
public class Solution60 {
	
	static int x = 0;
	static int y = 0;

	public String getPermutation(int n, int k) {
		int[] nums = new int[n];
		for (int i = 1; i <= n; i++) {
			nums[i - 1] = i;
		}
		x = n - 2;
		y = n - 1;
		for (int i = 1; i < k; i++) {
			nextPermutation(nums, x, y);
		}
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; i++) {
			str.append(nums[i]);
		}
		return str.toString();
	}

	public void nextPermutation(int[] nums, int i, int j) {
		for (; i >= 0; i--) {
			// 找到右邊比左邊大的
			if (nums[i + 1] > nums[i]) {
				break;
			}
		}

		if (i >= 0) {
			for (; j >= 0; j--) {
				// 再從右邊找出比 nums[i] 大的
				if (nums[j] > nums[i]) {
					break;
				}
			}
			swap(nums, i, j);
		}
		reverse(nums, i + 1);
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private static void reverse(int[] nums, int start) {
		int i = start, j = y;
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}

}
