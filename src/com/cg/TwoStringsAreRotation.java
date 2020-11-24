package com.cg;

public class TwoStringsAreRotation {
	public static void main(String[] args) {
		String original = "IndiaVsAustralia";
		String rotation = "AustraliaVsIndia";
		String concat = original + original;
		if(concat.indexOf(rotation) != -1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
