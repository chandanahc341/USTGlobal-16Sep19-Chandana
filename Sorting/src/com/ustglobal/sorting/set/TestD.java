package com.ustglobal.sorting.set;


import java.util.Iterator;
import java.util.TreeSet;


public class TestD {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(9);
		ts.add(11);
		//ts.add("deepa");-->classCastException(null and non generic not allowed)
		//ts.add(null);---->NullPointerException
		System.out.println("*******using for each************");
		for(Object s : ts) {
			System.out.println(s);
		}
		System.out.println("*****using iterator***********");
		Iterator<Object> it = ts.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
}
}
