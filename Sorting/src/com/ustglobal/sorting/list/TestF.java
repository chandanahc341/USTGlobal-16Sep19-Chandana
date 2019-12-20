package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestF {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(23);
		l.add(54);
		l.add(76);
		
		
		Integer peekElement = l.peek();
		System.out.println("peek element "+peekElement);
		Integer peekFirstElement = l.peek();
		System.out.println("peek First element "+peekFirstElement);
		Integer peekLastElement = l.peek();
		System.out.println("peek last element "+peekLastElement);
		System.out.println("After peek===========>"+l);
System.out.println("===============================================================");
		
		Integer pollElement = l.poll();
		System.out.println("poll element "+pollElement);
		Integer pollFirstElement = l.poll();
		System.out.println("poll First element "+pollFirstElement);
		Integer pollLastElement = l.poll();
		System.out.println("poll last element "+pollLastElement);
		System.out.println("After poll===========>"+l);
		
		
		l.push(33);
		System.out.println("After push======"+l);
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("After pop============="+l);
	}

}
