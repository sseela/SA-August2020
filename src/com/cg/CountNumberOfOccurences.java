package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNumberOfOccurences {
	public static void main(String[] args) {
		String str = "sandeep";
		String[] arr = str.split("");
		Map<String, Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(v->v, Collectors.counting()));
		System.out.println(map);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character to be searched");
		String s = sc.next();
		Iterator<String> itr = map.keySet().iterator();
		if(itr.hasNext()) {
			System.out.println(map.get(s));
		}
		
		
		/*Map<String, Long> map = list.stream().collect(Collectors.groupingBy(v->v, Collectors.counting()));
		System.out.println(map);*/
	}
}
