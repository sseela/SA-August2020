package com.cg;

public class LongestSubstringPalindrome {
	private static String str = "kalol";
	private static int startIndex;
	private static int lengthofPalindrome;
	public static void main(String[] args) {
		for(int i=0; i<str.length(); i++) {
			findLength(str, i, i);
			findLength(str, i, i+1);
		}
		System.out.println(str.substring(startIndex, startIndex+lengthofPalindrome));
	}
	private static void findLength(String str, int begin, int end) {
		while(begin>=0 && end<str.length() && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}
		if(end-begin-1 > lengthofPalindrome) {
			lengthofPalindrome = end-begin-1;
			startIndex = begin+1;
		}
	}
}
