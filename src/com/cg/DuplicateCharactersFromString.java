package com.cg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharactersFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name to find duplicates");
		String str = sc.next();
		duplicateCharacters(str);
	}

	private static void duplicateCharacters(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] arr = str.toCharArray();
		for(char c: arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
 		}
		
		for(char c: arr) {
			if(map.get(c) > 1) {
				System.out.print(c);
			}
		}
	}
}
