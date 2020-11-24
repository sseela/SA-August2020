package com.cg;

public class RemoveCharactersFromFirstStringWhichArePresentInSecondString {
	public static void main(String[] args) {
		String str1 = "India is great";
		str1 = str1.toLowerCase();
		String str2 = "in";
		char[] arr = str2.toCharArray();
		for(char c: arr) {
			str1 = str1.replaceAll(String.valueOf(c), "");
		}
		System.out.println(str1);
		
	}
}
