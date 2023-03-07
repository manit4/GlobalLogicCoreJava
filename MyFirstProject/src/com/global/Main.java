package com.global;

import com.global.pojo.Employee;

public class Main {

	public static void main(String[] args) {

//		int empid1 = 100;
//		String empName1 = "Anya";
//		int empAge1 = 20;
//		
//		int empid2 = 101;
//		String empName2 = "Ritesh";
//		int empAge2 = 21;
//		
//		int empid3 = 102;
//		String empName3 = "Siddhi";
//		int empAge3 = 20;
		
		
		Employee emp1 = new Employee();
		emp1.setAge(20);   emp1.setName("Ashu");     emp1.setId(100);
		
		Employee emp2 = new Employee(101, "Anya", 21);
		
		Employee[] employees = new Employee[5];

	}

}


//public class Main {
//
//	public static void main(String[] args) {
//
//		String name1 = "Ashutosh";
//		String name2 = "Ritesh";
//		String name3 = "Ashutosh";
//		
//		System.out.println(name1 == name3);
//		
//		System.out.println(name1.equals(name3));
//
//	}
//
//}


//public class Main {
//
//	public static void main(String[] args) {
//
//		Human h1 = new Human();      h1.mascularStrength = 400;
//		
//		System.out.println(h1);
//
//	}
//
//}




//public class Main {
//
//	public static void main(String[] args) {
//
//		Human anya = new Human();
//		Human ashu = new Human();      ashu.iq = 100;
//		
//		boolean status = anya.equals(ashu);
//		
//		System.out.println(status);
//		
//
//	}
//
//}


//public class Main {
//
//	public static void main(String[] args) {
//
//		ArithmeticOperations operations1 = new ArithmeticOperations();
//		
//		ArithmeticOperations operations2 = new ArithmeticOperations();
//		
//		System.out.println(operations1.k);
//		System.out.println(operations2.k);
//		
//		operations2.add(operations1);
//		
//		System.out.println(operations1.k);
//		System.out.println(operations2.k);
//		
//
//	}
//
//}
