package com.swguan.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * author: swGuan 
 * 1. use recursive 
 * 2. the permutations is swap first, after recursive swap again 
 * 3. check nums[i] == nums[i - 1] || nums[i] == nums[start] to avoid duplicate
 * 4. if i == start, do not need to swap
 * 5. for Unique situation, the swap back should do it out of the loop 
 * 
 */
public class Solution47 {

	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		permuteUnique(0, nums.length - 1, nums, result, new LinkedList<>());
		return result;
	}

	private void permuteUnique(int start, int limit, int[] nums, List<List<Integer>> result, LinkedList<Integer> temp) {
		if (start == limit) {
			temp.add(nums[start]);
			result.add(new LinkedList<>(temp));
			temp.remove(temp.size() - 1);
			return;
		}
		for (int i = start; i <= limit; i++) {
			if (i == start) {
				temp.add(nums[i]);
				permuteUnique(start + 1, limit, nums, result, temp);
				temp.remove(temp.size() - 1);
			} else if (nums[i] == nums[i - 1] || nums[i] == nums[start]) {
				continue;
			} else {
				temp.add(nums[i]);
				swap(nums, start, i);
				permuteUnique(start + 1, limit, nums, result, temp);
				temp.remove(temp.size() - 1);
			}
		}
		for (int i = start; i + 1 <= limit; i++) {
			swap(nums, i, i + 1);
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
