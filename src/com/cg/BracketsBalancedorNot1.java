package com.cg;

import java.util.Stack;

public class BracketsBalancedorNot1 {
	public static void main(String[] args) {
		String str = "{[()]}(}";
		boolean result = checkIfBalanced(str);
		if(result) {
			System.out.println("balanced");
		} else {
			System.out.println("not balanced");
		}
	}

	private static boolean checkIfBalanced(String str) {
		boolean result = false;
		Stack<Character> stack = new Stack<>();
		char[] arr = str.toCharArray();
		for(char c: arr) {
			if(c == '{' || c == '[' || c == '(') {
				stack.push(c);
			} else {
				if(stack.isEmpty()) {
					result =  false;
				}
				Character top = stack.peek();
				switch(c) {
				case '}': 
					if(top=='{' && c=='}') {
						stack.pop();
					} else {
						result =  false;
						break;
					}
					
				case ']': 
					if(top=='[' && c==']') {
						stack.pop();
					} else {
						result =  false;
						break;
					}
					
				case ')': 
					if(top=='(' && c==')') {
						stack.pop();
					} else {
						result = false;
						break;
					}
				}
				
				if(stack.isEmpty()) {
					result = true;
				}
			}	
		}
		return result;
	}
}
