package com.cg;

public class LongestSubstringWithRepeatingCharacters {
	private static String str = "LongestSubstringWithRepeatingCharacters";
	private static int startIndex;
	private static int lengthOfPalindrome;
	
	public static void main(String[] args) {
		for(int start=0; start<str.length(); start++) {
			CheckSubstring(start, start, str);
			CheckSubstring(start, start+1, str);
		}
	}

	private static void CheckSubstring(int begin, int end, String str) {
		while(begin >=0 && end<str.length() && str.charAt(begin) != str.charAt(end)) {
			begin--;
			end++;
		}
		if(lengthOfPalindrome < end - begin - 1) {
			lengthOfPalindrome = end-begin-1;
			startIndex = begin+1;
		}
		
	}
}
