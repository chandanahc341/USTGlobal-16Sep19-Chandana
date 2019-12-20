package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		List<Integer> l = al.stream().map(i -> i + 50).collect(Collectors.toList());
		System.out.println("Integer value is "+l);
		
		
		for(Integer i : l) {
			System.out.println(i);
		}
}

}
