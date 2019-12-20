package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestH {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(1,"deep");
		Employee e2 = new Employee(2,"sudeep");
		Employee e3 = new Employee(3,"pradeep");
		Employee e4 = new Employee(4,"jaideep");
		Employee e5 = new Employee(5,"saideep");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
				Comparator<Employee> cmp = (j,k)->{
			
			return j.name.compareTo(k.name); 
		};
		List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
		Iterator<Employee> it = l.iterator();
		
		while(it.hasNext()) {
	Employee i = it.next();
	System.out.println("Id is "+i.id);
	System.out.println("Name is "+i.name);
	System.out.println("=================");
	}

}
}
