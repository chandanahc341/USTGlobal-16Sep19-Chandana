package com.ustglobal.exception.first;

public class TestH {
	public static void main(String[] args) {
		System.out.println("Main started");
		PayTM p = new PayTM();
		try {
			p.book();
		}catch(ArithmeticException ae) {
			System.out.println("exception occured");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("Main ended");
	}

}
