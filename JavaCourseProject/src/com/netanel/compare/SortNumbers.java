package com.netanel.compare;

import java.util.*;

public class SortNumbers {
	public static void main(String[] args) {
		List<Double> l1= new ArrayList<Double>();
		Collections.addAll(l1, 3.0,6.5,2.7,4.0,8.7,3.0,8.0,9.4,2.7,1.0);
		Collections.sort(l1);
		System.out.println(l1);		
	}
}
