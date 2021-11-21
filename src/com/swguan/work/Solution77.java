package com.swguan.work;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * author: swGuan
 * 
 */
public class Solution77 {

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<>();
		recursiveList(n, k, 1, new ArrayList<>(), result);
		return result;
	}

	public void recursiveList(int n, int k, int start, List<Integer> temp, List<List<Integer>> result) {
		if (temp.size() == k) {
			result.add(new ArrayList<>(temp));
			return;
		}
		for (int i = start; i <= n - (k - temp.size()) + 1; i++) {
			temp.add(i);
			recursiveList(n, k, i + 1, temp, result);
			temp.remove(temp.size() - 1);
		}
	}

}
