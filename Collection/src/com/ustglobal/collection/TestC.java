package com.ustglobal.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(23);
		a1.add(29.1);
		a1.add(true);
		a1.add("good evening");
		Iterator i1 = a1.iterator();
		Object o1 = i1.next();
		System.out.println("obj1 "+o1);
		Object o2 = i1.next();
		System.out.println("obj2 "+o2);
		Object o3 = i1.next();
		System.out.println("obj3 "+o3);
		Object o4 = i1.next();
		System.out.println("obj4 "+o4);
	
		//Object o5 = i1.next();
		//System.out.println("obj5 "+o5);
		//NoSuchElement
		
		
		for(int i=0;i<a1.size();i++) {
			Object o = a1.get(i);
			System.out.println(o);
		}
		System.out.println("++++++++++++++++++++++++++++=============");
		ArrayList a2 = new ArrayList();
		a2.add(23);
		a2.add(29.1);
		a2.add(true);
		a2.add("good evening");
		Iterator i2 = a2.iterator();
		
		while(i2.hasNext()) {
			Object o = i2.next();
			System.out.println(o);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
	}

}
