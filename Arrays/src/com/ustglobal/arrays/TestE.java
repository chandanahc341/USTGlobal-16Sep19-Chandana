package com.ustglobal.arrays;

import java.util.ArrayList;



public class TestE {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee s1 = new Employee(101,"vinod",29);
		Employee s2 = new Employee(102,"manasa",20);
		Employee s3 = new Employee(103,"akshi",22);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i =0;i<al.size();i++) {
			Employee s = al.get(i);
			System.out.println("Id is "+s.eid);
			System.out.println("Name is "+s.ename);
			System.out.println("Age is "+s.age);
			
		}
		System.out.println("=====================");
		for(Employee s :al) {
			System.out.println(s);
		}
	}

}



