package com.cg;

public class RemoveGivenCharacterFromString {
	public static void main(String[] args) {
		String str = "sandeep";
		char c = 'p';
		
		System.out.println(str.replaceAll(String.valueOf(c), ""));
	}
}
