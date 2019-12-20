package com.ustglobal.sorting.set;


import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
	public static void main(String[] args) {
		TreeSet<Employee> hs = new TreeSet<Employee>();
		Employee e1 = new Employee(12,"sweety",45100);
		Employee e2 = new Employee(15,"prety",30100);
		Employee e3 = new Employee(16,"chweety",67100);
		Employee e4 = new Employee(17,"sweety",90100);
		Employee e5 = new Employee(18,"beauty",12100);
		
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("******using iterator**********");
		
		Iterator<Employee> it =hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e);
			System.out.println("id is "+e.id);
			System.out.println("name is "+e.name);
			System.out.println("salary is "+e.salary);
		}
	}



}
