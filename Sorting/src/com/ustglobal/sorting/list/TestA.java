package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestA {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(45);
		l.add(88);
		l.add(67);//should not pass null(nullpointerException will be thrown)
		l.add(65);
		System.out.println("Before sort "+l);
		Collections.sort(l);
		System.out.println("After sort "+l);
		
		Collections.reverse(l);
		System.out.println("After reverse "+l);
		
		
		Collections.shuffle(l);
		System.out.println("After shuffle "+l);
	}

}
