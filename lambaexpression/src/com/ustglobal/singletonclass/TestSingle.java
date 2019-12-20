package com.ustglobal.singletonclass;

public class TestSingle {
	public static void main(String[] args) {
		String s1 = "hello";
		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "hello";
		System.out.println("HashCode of ms"+ms.hashCode());
		
		MySingleton mx = MySingleton.getDbConnection();
		mx.s = "bye";
		System.out.println("HashCode of mx"+mx.hashCode());
		System.out.println(ms.s);
		System.out.println(mx.s);
		
	}

}
