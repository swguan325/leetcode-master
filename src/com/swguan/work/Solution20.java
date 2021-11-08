package com.swguan.work;

import java.util.Stack;

/** 
 * author: swGuan
 * 1. use Stack to push, pop
 * 2. when current is ')', the peek must be '('
 * 
 */
public class Solution20 {
	
	public boolean isValid(String s) {
		boolean isValid = true;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) return false;
				switch (s.charAt(i)) {
				case ')':
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						return false;
					}
					break;
				case ']':
					if (stack.peek() == '[') {
						stack.pop();
					} else {
						return false;
					}
					break;
				case '}':
					if (stack.peek() == '{') {
						stack.pop();
					} else {
						return false;
					}
					break;
				}

			}
		}
		return isValid && stack.isEmpty();
	}
	
}
