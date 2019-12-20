package com.ustglobal.collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class TestJ {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(12);
		s.add(39.3);
		s.add("ishan");
		s.add(true);
		s.add("sami");
		System.out.println("using for each");
	for(Object o :s) {
		System.out.println(o);
	}
	System.out.println("using listiterator=============");
	ListIterator li1 = s.listIterator();
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
