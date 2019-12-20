package com.ustglobal.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(12);
		li.add(39.3);
		li.add("ishan");
		li.add(true);
		li.add("sami");
		System.out.println("using for each");
	for(Object o :li) {
		System.out.println(o);
	}
	System.out.println("using listiterator=============");
	ListIterator li1 = li.listIterator();
	while(li1.hasNext()) {
		Object o = li1.next();
		System.out.println(o);
		
	}
	System.out.println("using iterated================");
		
		while(li1.hasPrevious()) {
			Object o = li1.previous();
			System.out.println(o);
		}
		

	}

}
