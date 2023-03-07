package com.global;

public class Wrapper {
	
	public static void main(String[] args) {
		
		//int i = 10;
		
//		Integer i1 = new Integer(10);
//		
//		Integer i2 = new Integer("10");
//		
//		Integer i3 = 10;
//		Integer i4 = 10;
//		
//		System.out.println(i3.equals(i2));
		
		
		
		int i = 45345354;
		
		String convertedI = ""+i;
		
		String subStr = convertedI.substring(2);
		
		int convertedString = Integer.parseInt(subStr);
		
		System.out.println(convertedString);
		
	}

}
