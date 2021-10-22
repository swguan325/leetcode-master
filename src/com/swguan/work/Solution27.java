package com.swguan.work;

/**
* 
* author: swGuan
* 1. if nums[i] == val, check nums[j], swap when nums[i] != nums[j]
* 2. use count to get number of item equals val
* 
*/
public class Solution27 {
	
	public int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;
		int count = (nums[0] == val) ? 1 : 0;
		for (int i = 0, j = 1; j < nums.length;) {
			if (nums[j] == val)
				count++;
			if (nums[i] == val) {
				if (nums[i] != nums[j]) {
					nums[i] = nums[j];
					nums[j] = val;
				} else if (nums[i] == nums[j]) {
					j++;
					continue;
				}
			}
			i++;
			j++;
		}
		return nums.length - count;
    }
	
}
