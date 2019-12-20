package com.ustglobal.customexception;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("main started");
		ValidateAmount va = new ValidateAmount();
		try {
		va.checkAmount(20000);
		System.out.println("withdraw your cash");
		}catch(InvalidAmountException e) {
		System.out.println(e.getMessage());
		}
		System.out.println("main ended");
	}

}
