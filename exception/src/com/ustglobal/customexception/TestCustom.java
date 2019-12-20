package com.ustglobal.customexception;

public class TestCustom {
	public static void main(String[] args)throws  CustomException{
		int a=10;
		int b=0;
		
		
		if(b==0) {
			throw new CustomException("you cant divide by zero");
		}
		else {
			int result=a/b;
			System.out.println(result);
		}
		
	}

}
