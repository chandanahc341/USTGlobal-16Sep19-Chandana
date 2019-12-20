package com.ustglobal.exception.first;

public class TestF {
public static void main(String[] args) {
	System.out.println("Main started");
	String s = "hello";
	int[] a = {10,20,30};
	int b = 10;
	try{
		String s1 = s.toUpperCase();
		System.out.println(s1);
		System.out.println(a[2]);
		System.out.println(b/2);
				
	}catch(NullPointerException np) {
		System.out.println("dont play with me");
	}catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("index not present");
	}
}
}
