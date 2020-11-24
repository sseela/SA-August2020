package com.cg;

import java.util.HashMap;
import java.util.Map;

public class ArrayOfStrings {
	public static void main(String[] args) {
		String[] arr = {"sand", "sand", "and", "are", "we", "we", "we"};
		Map<String, Integer> map = new HashMap<>();
		for(String s: arr) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			} else {
				map.put(s, 1);
			}
		}
		int count = 0;
		String key = "";
		for(String s: arr) {
			if(map.get(s) > count) {
				count = map.get(s);
				key = s;
			}
		}
		System.out.println(key);
	}
}
