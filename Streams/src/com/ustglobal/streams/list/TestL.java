package com.ustglobal.streams.list;

import java.util.ArrayList;

public class TestL {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1,"vinu"));
	
		al.add(new Employee(2,"anu"));
		al.add(new Employee(3,"manu"));
		al.add(new Employee(4,"sami"));
		al.add(new Employee(5,"ishu"));
		Helper h = new Helper();
		h.displayAllStudent(al);
	}

}
