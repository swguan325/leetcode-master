package com.swguan.work;

/**
 * 
 * author: swGuan
 * 1. find mini length of String array
 * 2. once not String is not match minus one of mini length
 */
public class Solution14 {

	public String longestCommonPrefix(String[] strs) {
		int len = strs.length;
		int i = 1, minLen = strs[0].length();

		while (minLen > 0) {
			while (i < len) {
				minLen = Math.min(minLen, strs[i].length());
				if (minLen == 0 || !(strs[0].substring(0, minLen).equals(strs[i].substring(0, minLen)))) {
					i = 1;
					minLen--;
					break;
				}
				i++;
			}
			// i == len, means each string is match, return the minLen of the String
			if (i == len) {
				return strs[0].substring(0, minLen);
			}
		}
		return "";
    }
	
}
