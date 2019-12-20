package com.ustglobal.collection;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(29.1);
		a1.add(true);
		a1.add("chinnu");
		
		for(Object o : a1) {
			System.out.println(o);
		}
		
	}

}
