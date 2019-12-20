package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(23);
		ls.add("vinod");
		ls.add(45.44);
		ls.add("rekha");
		ls.add(23);
		System.out.println("***********using for each************");
		for(Object s : ls) {
			System.out.println(s);
		}
		System.out.println("*****using iterator***********");
		Iterator<Object> it = ls.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
