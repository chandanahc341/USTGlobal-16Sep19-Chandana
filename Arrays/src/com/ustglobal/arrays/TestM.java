package com.ustglobal.arrays;

import java.util.ArrayList;
import java.util.List;

public class TestM {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(32.22);
		al.add(12.33);
		al.add(90.55);
		al.add(45.66);
		System.out.println(al);
		al.add(2,54.6);
		System.out.println("After add in 2nd index "+al);
		al.remove(0);
		System.out.println("After removing 0th index "+al);
		al.remove(null);
		System.out.println("After removing null "+al);
		Double val =  al.get(3);
		System.out.println("Object at 3th index "+al);
		al.set(3, 88.66);
		System.out.println("After replacing 3rd index "+al);
		al.clear();
		System.out.println("After clear() method "+al);
		al.contains(45.66);
		List<Double> al1 = new ArrayList<Double>();
		al1.add(28.44);
		al1.add(18.42);
		al1.add(38.11);
		al1.add(48.22);
		al.addAll(al1);
		System.out.println("After add al1 "+al);
		
		boolean contain = al.containsAll(al1);
		System.out.println("Contains all of al1 "+contain);
		
		boolean res = al.removeAll(al1);
		System.out.println("Removed al1 of all "+res);
	}

}
