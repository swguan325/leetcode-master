package com.swguan.work;

import java.util.Stack;

/**
 * 
 * author: swGuan
 * 
 */
public class Solution71 {
			
	public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");
        for (String s : paths) {
			switch (s) {
			case ".":
			case "":
				break;
			case "..":
				if (!stack.isEmpty())
					stack.pop();
				break;
			default:
				stack.push(s);
				break;
			}
        }
        StringBuilder sb = new StringBuilder();
        for (String s : stack) 
            sb.append("/").append(s);
        if (sb.length() == 0) return "/";
        return sb.toString();
    }

}
