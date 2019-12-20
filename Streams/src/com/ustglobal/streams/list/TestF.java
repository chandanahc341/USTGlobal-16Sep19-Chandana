package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.List;

public class TestF {
public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(25);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		List<Integer> l = al.stream().sorted().collect(	Collectors.toList());
		Iterator<Integer> it = al.iterator();
		System.out.println("sorted============");
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}

		}
}

