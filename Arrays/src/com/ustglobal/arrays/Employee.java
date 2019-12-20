package com.ustglobal.arrays;

public class Employee {
	int eid;
	String ename;
	int age;
	public Employee(int eid, String ename, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + "]";
	}
	

}
