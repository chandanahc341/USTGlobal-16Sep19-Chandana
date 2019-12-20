package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		SortByName sb = new SortByName();
		SortByPincode sb1 = new SortByPincode();
		SortByMicr sb2 = new SortByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		TreeSet<Bank> ts1 = new TreeSet<Bank>(sb1);
		TreeSet<Bank> ts2 = new TreeSet<Bank>(sb2);
		
		Bank b1 = new Bank("corporation",229,3845789);
		Bank b2 = new Bank("hdfc",329,87654);
		Bank b3 = new Bank("karnataka",657,425789);
		Bank b4 = new Bank("state",829,8989076);
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("*********Using iterator**********");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println(b);
			System.out.println("Name is "+b.name);
			System.out.println("pincode is "+b.pincode);
			System.out.println("Micr is "+b.micr);
			System.out.println("***************************");
		}
	}

}
