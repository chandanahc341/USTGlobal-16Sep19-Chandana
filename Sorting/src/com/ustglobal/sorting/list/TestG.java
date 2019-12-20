package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestG {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(12);
		s.push(23);
		s.push(56);
		
		System.out.println("Using get()========");
		for(int i = 0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		System.out.println("using pop()...");
		for(int i =0;i<s.size();i++) {
			System.out.println(s.pop());
		}
	}

}
