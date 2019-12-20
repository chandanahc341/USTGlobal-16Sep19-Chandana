package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		Predicate<Employee> p = e ->{
			if(e.salary >=20000) {
				return true;
			}else {
				return false;
			}
		};
		Employee e = new Employee(1,"prasad",20000);
		
		boolean res = p.test(e)
;
		System.out.println("Result is "+res);
	}

}
