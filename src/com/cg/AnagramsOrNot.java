package com.cg;

import java.util.Scanner;

public class AnagramsOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name1");
		String str1 = sc.next();
		System.out.println("enter name2");
		String str2 = sc.next();
		anagrams(str1, str2);
	}

	private static void anagrams(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length()) {
			System.out.println("not anagrams");
		}
		
		for(int i=0; i<str1.length(); i++) {
			for(int j=0; j<str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					str1 = str1.substring(0, i)+str1.substring(i+1);
					str2 = str2.substring(0, j)+str2.substring(j+1);	//once I remove the character, I have to start comparing again from start
					i=-1;
					break;
				}
			}
		}
		if(str1.equals("") && str2.equals("")) {
			System.out.println("anagrams");
		} else {
			System.out.println("not anagrams");
		}
	}
}
