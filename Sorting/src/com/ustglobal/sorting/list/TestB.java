package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestB {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ishan");
		al.add("sami");
		al.add("vasu");
		al.add("pushpa");
		
		System.out.println("Before sort------------> "+al);
		Collections.sort(al);
		System.out.println("After sorting------------>" +al);
		
	}
}
