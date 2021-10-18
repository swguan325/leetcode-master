package com.swguan.work;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
* 
* author: swGuan
* 1. Base on threeSum, j is just like i, increased by each loop
* 2. when newTarget > nums[k] + nums[l], means it need increase the number => j++
* 3. when newTarget < nums[k] + nums[l], means it need decrease the number => k--
*/
public class Solution18 {
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> res = new LinkedList<>();
		int len = nums.length;
		// j, k, l
		for (int i = 0; i < len - 3; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				// k, l
				for (int j = i + 1; j < len - 2; j++) {
					if (j == i + 1 || (j > i + 1 && nums[j] != nums[j - 1])) {
						int k = j + 1, l = len - 1, newTarget = target - nums[i] - nums[j];
						while (k < l) {
							if (nums[k] + nums[l] == newTarget) {
								res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
								// 避免遇到連續的 k
								while (k < l && nums[k] == nums[k + 1])
									k++;
								// 避免遇到連續的 l
								while (k < l && nums[l] == nums[l - 1])
									l--;
								k++;
								l--;
							} else if (nums[k] + nums[l] < newTarget) {
								k++;
							} else {
								l--;
							}
						}
					}
				}
			}
		}
		return res;
	}
	
}
