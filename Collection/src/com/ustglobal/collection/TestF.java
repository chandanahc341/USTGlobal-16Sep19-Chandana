package com.ustglobal.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("prakash");
		a1.add("vasu");
		a1.add("sachin");
		a1.add("chandu");
		String name = a1.get(0);
		System.out.println(name.toUpperCase());
		System.out.println("using iterator==============================");
		Iterator<String> li = a1.iterator();
		while(li.hasNext()) {
			String s = li.next();
			System.out.println(s);
		}
		System.out.println("using listiterator===========================");
		ListIterator<String> l = a1.listIterator();
		while(l.hasNext()) {
			String s1 = l.next();
			System.out.println(s1);
		}
		System.out.println("using for each==========================");
		
		for(String n :a1) {
			System.out.println(n);
		}
	}

}
