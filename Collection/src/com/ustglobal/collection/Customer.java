package com.ustglobal.collection;

public class Customer  {
	private int cid;
	public Customer(int cid, String cname, int age) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.age = age;
	}


	private String cname;
	private int age;

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", age=" + age + "]";
	}
//	@Override
//	public int compareTo(Customer c2) {
//		if(this.getCid()>c2.getCid())
//			return 1;
//		else
//			return -1;
//	}

}
