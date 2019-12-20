package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kukku",98765);
		hm.put("ishu",4356789);
		hm.put("pooja", 56789999);
		hm.put("bheem", 98765989);
		System.out.println("Data"+hm);
		hm.put("ishu",576879068 );
		System.out.println("After modify "+hm);
		hm.put("sharal", 576879068);
		System.out.println("After sharal "+hm);
		System.out.println("After null "+hm);
		System.out.println("*******************");
		System.out.println("After adding duplicate null");
		System.out.println(hm);
		Object phoneno = hm.get("bheem");
		System.out.println("value "+phoneno);
		System.out.println("++++++++++++++");
		Object phoneno1 = hm.get("bhe");
		System.out.println("value "+phoneno1);
		
		Object value = hm.remove("kukku");
		System.out.println("Value "+value);
		
		System.out.println("After remove---------->"+hm);
		
	}

}
