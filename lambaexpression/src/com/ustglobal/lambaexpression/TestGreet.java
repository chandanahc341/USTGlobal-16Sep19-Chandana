package com.ustglobal.lambaexpression;

public class TestGreet  {
	public static void main(String[] args) {
		Message mes = (s)->s;
		String m1 = mes.greet("vinod");
		System.out.println("message is "+m1);
	}

}
