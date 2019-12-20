package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestH {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"anusha",95000);
		Employee e2 = new Employee(2,"bhoomi",85000);
		Employee e3 = new Employee(3,"chandu",75000);
		Employee e4 = new Employee(4,"madhu",65000);
		Employee e5 = new Employee(5,"amulya",55000);
		Employee e6 = new Employee(6,"manu",20000);
		Employee e7 = new Employee(7,"asha",45000);
		Employee e8 = new Employee(8,"preethi",35000);
		Employee e9 = new Employee(9,"ramu",15000);
		
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		
		
		HashMap<String,ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Employee> first = hm.get("second");
		
		Iterator<Employee> it = first.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is " +e.eid);
			System.out.println("Name is "+e.ename);
			System.out.println("Percentage is "+e.salary);
			System.out.println("****************");
		}
		
		
	}

}
