package com.ustglobal.javaBeanClass;

public class EmpTestC {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setid(12);
		e.setName("vinod");
		e.setSalary(100000);
		e.setDept(101);
		e.setDesignation("engineer");
		EmpDatabase ed = new EmpDatabase();
		ed.receive(e);
	}

}
