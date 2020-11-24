package com.cg;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		String str = "jobsemtsrcxy";
		String str1 = str.toLowerCase();
		char[] arr = str1.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		int longestLength = 0;
		String result = null;
		for(int i=0; i<arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			} else {
				i = map.get(arr[i]);
				map.clear();
			}
			if(map.size() > longestLength) {
				longestLength = map.size();
				result = map.keySet().toString();
			}
		}
		System.out.println(result);
	}
}
