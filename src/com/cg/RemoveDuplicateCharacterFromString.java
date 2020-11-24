package com.cg;

public class RemoveDuplicateCharacterFromString {
	public static void main(String[] args) {
		String str = "keerravani";
		String result = "";
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length()-1; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					str = str.substring(0,j)+str.substring(j+1);
				}
			}
		}
		System.out.println(str);
	}
}
