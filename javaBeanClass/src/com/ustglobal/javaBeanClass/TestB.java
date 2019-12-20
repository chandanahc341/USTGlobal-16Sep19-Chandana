package com.ustglobal.javaBeanClass;

public class TestB {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(12);
		s.setName("vinod");
		s.setMarks(90);
		Database db = new Database();
		db.receive(s);
	}

}
