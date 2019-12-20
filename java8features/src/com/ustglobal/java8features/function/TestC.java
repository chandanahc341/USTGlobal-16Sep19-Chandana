package com.ustglobal.java8features.function;

import java.util.function.Supplier;

public class TestC {
	public static void main(String[] args) {
		Supplier<Student1> s = () -> new Student1(2,"ajay",65.83);
		
		Student1 s1 = s.get();
		System.out.println("Id is "+s1.id);
		System.out.println("Name is "+s1.name);
		System.out.println("Percentage is "+s1.percentage);
		
		Supplier<Integer> i = () -> 20;
		int val = i.get();
		System.out.println("Value "+val);
		
		
		Supplier<String> sp = () -> "good morning";
		String v = sp.get();
		System.out.println("Value "+v);
		
	}

}
