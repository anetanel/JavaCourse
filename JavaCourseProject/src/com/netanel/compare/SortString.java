package com.netanel.compare;

import java.util.*;

public class SortString {
	public static void main(String[] args) {
		List<String> s1 = new ArrayList<>();
		Collections.addAll(s1, "zbaa", "aaaa", "qcaaa", "5d");
		System.out.println(s1);
		Collections.sort(s1);
		System.out.println(s1);
		Collections.sort(s1, 
				(o1, o2) -> o1.charAt(1) - o2.charAt(1) );
		System.out.println(s1);
	}
}

//class myCompare implements Comparator<String> {
//	@Override
//	public int compare(String o1, String o2) {
//		return o1.charAt(1) - o2.charAt(1);
//	}
//}
