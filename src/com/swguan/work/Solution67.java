package com.swguan.work;

/**
 * 
 * author: swGuan
 * 
 */
public class Solution67 {

	public String addBinary(String a, String b) {
		StringBuilder s = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int result = 0;
		while (true) {
			if (i < 0 && j < 0) {
				if (result > 0)
					s.insert(0, '1');
				break;
			}
			if (i >= 0) {
				result += a.charAt(i) - '0';
			}

			if (j >= 0) {
				result += b.charAt(j) - '0';
			}
			switch (result) {
			case 3:
				result = 1;
				s.insert(0, '1');
				break;
			case 2:
				result = 1;
				s.insert(0, '0');
				break;
			case 1:
				result = 0;
				s.insert(0, '1');
				break;
			case 0:
				result = 0;
				s.insert(0, '0');
				break;
			}

			i--;
			j--;
		}
		return s.toString();
	}

}
