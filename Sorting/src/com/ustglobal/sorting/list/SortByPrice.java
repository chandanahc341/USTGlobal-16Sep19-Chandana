package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPrice implements Comparator<Pen> {
	
	@Override
	public int compare(Pen m1, Pen m2)  {
		
		if(m1.price>m2.price) {
			return 1;
		}else if(m1.price<m2.price) {
			return -1;
		}else {
			return 0;
		}
	}

}
