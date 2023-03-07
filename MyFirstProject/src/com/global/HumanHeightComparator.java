package com.global;

import java.util.Comparator;

public class HumanHeightComparator implements Comparator<Human>{

	@Override
	public int compare(Human o1, Human o2) {
		System.out.println("hiiii");
		
		if(o1.height < o2.height) {
			
			return -1;
		}
		else {
			
			return 1;
		}
	}

	
	
	

}
