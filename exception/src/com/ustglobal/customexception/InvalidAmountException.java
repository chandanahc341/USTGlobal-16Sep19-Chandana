package com.ustglobal.customexception;

public class InvalidAmountException extends RuntimeException {
	private String message = "Daily limit is 40000";
@Override
	public String getMessage() {
		return null;
	}
	

}
