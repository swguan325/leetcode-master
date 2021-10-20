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
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				switch (ch) {
				case ')':
					if (stack.peek() == '(') {
						stack.pop();
						continue;
					}
					break;
				case ']':
					if (stack.peek() == '[') {
						stack.pop();
						continue;
					}
					break;
				case '}':
					if (stack.peek() == '{') {
						stack.pop();
						continue;
					}
					break;
				}
				return false;
			}
		}
		return stack.isEmpty();
	}
	
}
