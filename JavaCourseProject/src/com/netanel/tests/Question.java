package com.netanel.tests;

import java.util.*;

public class Question {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		set1.add("1");
		set1.add("2");
		set2.add("1");
		set2.add("2");
		
		HashMap<HashSet<String>, String> map1 = new HashMap<HashSet<String>, String>();
		map1.put(set1, null);
		
		System.out.println(map1.containsKey(set2));
		
		set1.add("3");
		set2.add("3");
		
		System.out.println(map1.containsKey(set2));
	}
}
