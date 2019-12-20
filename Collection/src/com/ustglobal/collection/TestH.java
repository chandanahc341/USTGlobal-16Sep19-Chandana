package com.ustglobal.collection;

import java.util.ListIterator;
import java.util.Vector;

public class TestH {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(12);
		v.add(39.3);
		v.add("ishan");
		v.add(true);
		v.add("sami");
		System.out.println("using for each");
	for(Object o :v) {
		System.out.println(o);
	}
	System.out.println("using listiterator=============");
	ListIterator li1 = v.listIterator();
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
