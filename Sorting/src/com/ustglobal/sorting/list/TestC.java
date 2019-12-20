package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestC {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(1,"dimpu",35.6);
		Student s2 = new Student(2,"champ",60.55);
		Student s3 = new Student(3,"jimmy",45.33);
		Student s4 = new Student(4,"pummy",30.44);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("Before sorting===========");
		displayStudentDetails(al);
		Collections.sort((List<Student>) al);
		System.out.println("After sorting==============");
		displayStudentDetails(al);
		
		
	}
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("-----------------------------");
		}
	}

}
