package com.ustglobal.maps;

import java.util.Hashtable;
import java.util.Map.Entry;

public class TestJ {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(101, "ajay");
		ht.put(102, "vijay");
		ht.put(100, "asha");
		//ht.put(null,"pavi");NullPointerException
		//ht.put(109,null);NullPointerException
		
	for(Entry<Integer,String> h : ht.entrySet()) {
		System.out.println("key " +h.getKey()+ " value " +h.getValue());
	}
		
	}

}
