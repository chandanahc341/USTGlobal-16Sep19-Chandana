package com.ustglobal.collection;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("shreya");
		Object o = a1.get(0);
		String name = (String) o;
		name = name.toUpperCase();
		System.out.println(name);
	}

}
