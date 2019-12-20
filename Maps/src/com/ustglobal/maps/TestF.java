package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestF {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("patna", 560068);
		lh.put("hassan", 573116);
		lh.put("Banglore+",78988);
	 
		//lh.put(null,098765); NullPointerException
		
		for(Map.Entry<String,Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key);
			System.out.println("value is "+value);
			System.out.println("=======================");
		}
	}

}
