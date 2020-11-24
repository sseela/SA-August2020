package com.cg;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name to reverse");
		String str = sc.next();
		reverse(str);
	}

	private static void reverse(String str) {
		String s = "";
		for(int i=str.length()-1; i>=0; i--) {
			s = s + str.charAt(i);
		}
		System.out.println(s);
	}
}
