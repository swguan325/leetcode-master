package com.swguan.work;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * author: swGuan
 * 1. ex: 1, 2, 3
 * 2. shift i: 3(11), i >> 1 => 11, i >> 2 => 1, i >> 3 => 0
 * 3. the result => 1, 2
 * 
 */
public class Solution78 {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());
		getFullSubset(nums, result);
		return result;
	}

	public void getFullSubset(int[] nums, List<List<Integer>> result) {
		int maxI = (1 << nums.length) - 1;
		for (int i = 1; i <= maxI; i++) {
			List<Integer> temp = new ArrayList<>();
			for (int j = 0; j < nums.length; j++) {
				if (((i >> j) & 1) == 1) {
					temp.add(nums[j]);
				}
			}
			result.add(new ArrayList<>(temp));
		}
	}

}
