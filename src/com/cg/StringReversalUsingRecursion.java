package com.cg;

public class StringReversalUsingRecursion {
	public static void main(String[] args) {
		String str = "sandeep";
		System.out.println(recursiveMethod(str));
	}

	private static String recursiveMethod(String str) {
		if(str.length() == 0) {
			return str;
		} 
		return recursiveMethod(str.substring(1))+str.charAt(0);
		
	}
}
