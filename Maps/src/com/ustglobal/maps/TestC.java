package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Banglore", 560068);
		lh.put("hassan", 573116);
		lh.put("patna",78988);
		
		System.out.println(lh);
		
		Set<String> s = lh.keySet();
		for(String key : s) {
			System.out.println("Key "+key);
		}
		System.out.println("===================");
		Collection<Integer> val = lh.values();
		for(Integer value : val) {
			System.out.println("value "+value);
		}
		System.out.println("=================");
	}

}
