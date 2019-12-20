package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(12);
		al.add(40);
		al.add(55);
		al.add(60);
		al.add(88);
		
		List<Integer> l = al.stream().filter(i -> i%3==0).collect(Collectors.toList());
		System.out.println("Integer value is "+l);
		
		
		for(Integer i : l) {
			System.out.println(i);
		}
	}


}
