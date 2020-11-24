package com.cg;

public class ReverseWordsInSentence {
	public static void main(String[] args) {
		String str = "My name is Sandeep";
		String[] arr = str.split("\\s+");
		String result="";
		for(int i=arr.length-1; i>=0; i--) {
			result = result + arr[i] + " ";
		}
		System.out.println(result);
	}

	
}
