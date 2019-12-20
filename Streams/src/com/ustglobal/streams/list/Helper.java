package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper {
	void displayAllStudent(ArrayList<Employee> al) {
		
		Iterator<Employee> it = al.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("============================");
		}
	}

}
