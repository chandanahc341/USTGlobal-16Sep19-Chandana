package com.ustglobal.customexception;

public class Validator {
	void verify(int age) {
		if(age < 18) {
			throw new InvalidAgeException("try again");
			
		}
	}

}
