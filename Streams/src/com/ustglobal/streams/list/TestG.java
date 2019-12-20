package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestG {
public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(25);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);

		Comparator<Integer> cmp = (m1 , m2)->{
			if(m1>m2) { 
				return 1;
			}	
			else if(m1<m2) { 
				return -1;
			}else {
				return 0;
			}
		};
		long noOfFailedStudents = al.stream().filter(i->i < 40).count();
		
		System.out.println(noOfFailedStudents);
		
		System.out.println("====================");
		Integer i = al.stream().min(cmp).get();
		System.out.println("Min Value "+i);
		
		
		System.out.println("********************");
		Integer j = al.stream().max(cmp).get();
		System.out.println("Max Value "+j);

}


}
