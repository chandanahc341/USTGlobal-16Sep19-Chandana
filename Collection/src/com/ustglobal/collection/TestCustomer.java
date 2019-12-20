package com.ustglobal.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCustomer {
	public static void main(String[] args) {
		List<Customer> l = new ArrayList<Customer>();
		l.add(new Customer(8,"ishu",27));
		l.add(new Customer(1,"sami",24));
		l.add(new Customer(6,"vasu",20));

			Collections.sort(l, new NameComparator());

			for(Customer c :l) {
				System.out.println(c);
			}
		}

	}
