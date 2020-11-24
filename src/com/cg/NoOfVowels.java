package com.cg;

public class NoOfVowels {
	public static void main(String[] args) {
		String str = "aeiou km";
		str = str.replaceAll("\\s+", "");
		int count = 0;
		char[] arr = str.toCharArray();
		for(char c: arr) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':  count++; break;
			default: 
			}
		}
		System.out.println("Number of vowels: "+count);
		System.out.println("Number of consonants: "+(str.length()-count));
	}
}
