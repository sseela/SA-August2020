package com.cg;

import java.util.regex.Pattern;

public class StringContainsOnlyDigits {
	public static void main(String[] args) {
		String str = "123";
		if(str.matches("[0-9]+")) {
			System.out.println("only digits");
			System.out.println(str.replaceAll("\\s", "*"));
		} else {
			System.out.println("not digits");
		}
		//System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "uuuuuu"));
	}
}
