package com.ustglobal.java8features.function;

import java.util.function.Consumer;

public class TestD {
	public static void main(String[] args) {
	
		Consumer<Student1> c = s->{
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=============================");
		};
		Student1 s = new Student1(1,"chandu",78.55);
		c.accept(s);
	}

}
