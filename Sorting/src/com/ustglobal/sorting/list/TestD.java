package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestD {
	public static void main(String[] args) {
		LinkedList<Laptop> l = new LinkedList<Laptop>();
		Laptop lp1 = new Laptop(25000,4,"Dell");
		Laptop lp2 = new Laptop(35000,6,"Hp");
		Laptop lp3 = new Laptop(40000,12,"inspiron");
		Laptop lp4 = new Laptop(15000,8,"asus");
		l.add(lp1);
		l.add(lp2);
		l.add(lp3);
		l.add(lp4);
		l.add(new Laptop(18000,2,"acer"));
		
		
		System.out.println("Before sorting==============");
		displayLaptopDetails(l);
		Collections.sort(l);
		System.out.println("After sorting==============");
		displayLaptopDetails(l);
		
		
	}
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("Brand is "+lp.name);
			System.out.println("Price is "+lp.price);
			System.out.println("Ram is "+lp.ram);
			System.out.println("==========================");
		}
	}

}
