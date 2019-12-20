package com.ustglobal.customexception;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("main started");
		Validator v = new Validator();
		try {
			v.verify(13);
		}catch(InvalidAgeException ie) {
			System.out.println("exception occured");
		}
		System.out.println("main ended");
	}

}
