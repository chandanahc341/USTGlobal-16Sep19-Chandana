package com.ustglobal.immutable;

public class TestString {
	public static void main(String[] args) {
		MyString ms = new MyString(12,"pushpa");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		MyString mx = ms.changeContent(34, "vinu");
		System.out.println(mx.getName());
		System.out.println(mx.getRollno());
		System.out.println(mx);
		
	}

}
