package com.ustglobal.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		pen p = new pen();
		pen p1 = new Marker();//up casting
		System.out.println(p1.a);
		p1.write();
		Marker m = new Marker();//down casting
		m.color();
		m.write();
		p.write();
	}

}
