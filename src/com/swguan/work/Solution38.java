package com.swguan.work;

/**
* 
* author: swGuan
* 1. use recursive
* 2. find the return string when str[j] != str[i] or str[j] equals the str length
* 3. number of X + X
* 
*/
public class Solution38 {
	
	public String countAndSay(int n) {
		if (n == 1)
			return "1";
		return recursiveStr(n);
	}

	public String recursiveStr(int n) {
		if (n == 2) {
			return "11";
		}
		String str = recursiveStr(n - 1);
		StringBuilder s = new StringBuilder();
		for (int i = 0, j = 1; i < str.length() && j <= str.length(); j++) {
			if (j == str.length() || str.charAt(j) != str.charAt(i)) {
				s.append(j - i).append(str.charAt(i));
				i = j;
			}
		}
		return s.toString();
	}
	
}
