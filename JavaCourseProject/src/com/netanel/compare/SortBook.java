package com.netanel.compare;

import java.util.*;
import com.netanel.libray.Book;

public class SortBook {
	public static void main(String[] args) {
		List<Book> b1 = new ArrayList<>();
		Collections.addAll(b1, new Book("zaaa"), new Book("bbb"), new Book("xxx"));
		System.out.println(b1);
		Collections.sort(b1);
		System.out.println(b1);
	}
}
