package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku",987654);
		hm.put("ramya", 776655);
		hm.put("sowmya", 889999);
		hm.put("bavya", 678978);

		HashMap hm1 = new HashMap();
		hm1.put("deepu",687654);
		hm1.put("appu", 976655);
		hm1.put("ammu", 589999);
		hm1.put("chinnu", 278978);
		
		boolean hasKey = hm.containsKey("ramya");
		System.out.println("Has key "+hasKey);
		
		System.out.println("=====================");
		
		boolean hasValue = hm.containsKey(678978);
		System.out.println("Has value "+hasValue);
		
		
		hm.putAll(hm1);
		System.out.println("After putAll "+hm);
		
		System.out.println(hm.size());
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty "+isEmpty);
		
		hm.clear();
		System.out.println("After clear() "+hm);
		
		

	}

}
