package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestH {
	public static void main(String[] args) {
		LinkedList<Pen> lp = new LinkedList<Pen>(); 
		Pen p1 = new Pen(10,"cello");
		Pen p2 = new Pen(14,"gel");
		Pen p3 = new Pen(13,"writometer");
		Pen p4 = new Pen(11,"pin point");
		Pen p5 = new Pen(12,"reynolds");
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		lp.add(p4);
		lp.add(p5);
		
		System.out.println("Before sorting======================");
		displayPenDetails(lp);
		Collections.sort(lp);
		
		System.out.println("After sorting=======================");
		displayPenDetails(lp);
		
	}
	static void displayPenDetails(LinkedList<Pen> lp) {
		Iterator<Pen> it = lp.iterator();
		while(it.hasNext()) {
			Pen p = it.next();
			System.out.println("pen price is "+p.price);
			System.out.println("pen brand is "+p.brand);
		}
	}

}
