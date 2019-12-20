package com.ustglobal.java8features.function;

import java.util.function.Function;


public class TestB {
	public static void main(String[] args) {
		Function<Integer,Student1> f = id->{
			Student1 s = new Student1(2,"vijay",45.53);
			s.id = id;
			return s;
			
		};
		Student1 s = f.apply(25);
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage "+s.percentage);
	}

}
