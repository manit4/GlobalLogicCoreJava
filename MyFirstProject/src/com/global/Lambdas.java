package com.global;

import java.util.function.Predicate;


public class Lambdas {

	public static void main(String[] args) {
		
		emp[] employee=new emp[3];
		employee[0] = new emp(10000,6);
		employee[1] = new emp(6000,2);
		employee[2] = new emp(40000,9);
		
		
		Predicate<emp> predicate=(e)->{
			if(e.getExperiene()>5) {
				e.setSalary(e.getSalary()*2);
				return true;
			}
			return false;
		};
		
		for(emp e: employee) {
			predicate.test(e);
			System.out.println(e.salary);
		}
		
//		String[] names = { "Raghav", "Anurag", "Mayur", "Anya" };
//		
//		Predicate<String> predicate = ( name ) -> name.length() > 4;
//		
//		for(String name : names) {
//			
//			if(predicate.test(name)) {
//				
//				System.out.println(name);
//			}
//		}
	}
}

//public class Lambdas {
//	
//	static Predicate<String> predicate = null;
//
//	public static void main(String[] args) {
//		
//		String[] names = { "Raghav", "Anurag", "Mayur", "Anya" };
//		
//		//Predicate<String> predicate = ( name ) -> name.length() > 4;
//		
//		for(String name : names) {
//			
//			if(name.length() > 5) {
//				
//				System.out.println(name);
//			}
//		}
//	}
//}


//public class Lambdas {
//	
//	static Predicate<String> predicate = null;
//
//	public static void main(String[] args) {
//		
//		predicate  = ( name ) -> name.length() > 4;
//		
//		boolean status = predicate.test("Nama Sagar");
//		
//		System.out.println(status);
//	}
//}


//public class Lambdas {
//	
//	static Predicate<String> predicate = null;
//
//	public static void main(String[] args) {
//		
//		predicate  = ( name ) -> {
//			
//			if(name.length() > 4) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		};
//		
//		boolean status = predicate.test("Nama Sagar");
//		
//		System.out.println(status);
//	}
//}

//interface Cab {
//
//	int bookCab(String source, String destination);
//}
//
//
//
//public class Lambdas {
//
//	public static void main(String[] args) {
//		
//		Cab cab = (source, destination) -> {
//			System.out.println("Your cab has been booked from "+source+" to "+destination);
//			return 10000;
//		};
//		
//		int fare = cab.bookCab("Noida", "Gurgaon");
//		
//		System.out.println("Your total fare is "+fare);
//	}
//}


//interface Cab {
//
//	int bookCab(String source, String destination);
//}
//
//class Uber implements  Cab {
//
//	public int bookCab(String source, String destination) {
//		
//		System.out.println("Your cab has been booked from "+source+" to "+destination);
//		return 10000;
//	}	
//}
//
//
//public class Lambdas {
//
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		int fare = cab.bookCab("Delhi", "Mumbai");
//		
//		System.out.println("The fare is "+fare);
//	}
//}

//interface Cab {
//
//	void bookCab(String source, String destination);
//}
//
//
//public class Lambdas {
//
//	public static void main(String[] args) {
//		
//		Cab cab = ( source, destination) -> System.out.println("Your cab has been booked from "+source+ " to "+destination);
//		cab.bookCab("Delhi", "Kolkata");
//	}
//}

//interface Cab {
//
//	void bookCab(String source, String destination);
//}
//
//class Uber implements Cab {
//
//	@Override
//	public void bookCab(String source, String destination) {
//		System.out.println("Your cab has been booked from "+source+ " to "+destination);
//		
//	}
//}
//
//public class Lambdas {
//
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		cab.bookCab("Delhi", "Kolkata");
//	}
//}


//interface Cab {
//
//	void bookCab();
//}
//public class Lambdas {
//
//	public static void main(String[] args) {
//		
//		Cab cab = () -> System.out.println("Your Cab has been booked");
//		cab.bookCab();
//	}
//}

//interface Cab {
//
//	void bookCab();
//}
//
//class Uber implements Cab {
//
//	@Override
//	public void bookCab() {
//
//		System.out.println("Your Cab has been booked");
//
//	}
//
//}
//
//public class Lambdas {
//
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		cab.bookCab();
//
//	}
//
//}

//@FunctionalInterface
//interface A {
//	
//	default void print() {
//		System.out.println("A");
//	}
//	
//	void add();
//	//void sub();    since this interface A is FunctionInterface can not have more than 1 abstract method
//}
//
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		
//	}
//
//}

//interface A {
//	
//	default void print() {
//		System.out.println("A");
//	}
//}
//
//interface B {
//	
//	static void print() {
//		System.out.println("B");
//	}
//}
//
//class C implements B, A {
//	
//	
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		C c = new C();
//		c.print();
//	}
//
//}

//interface A {
//	
//	default void print() {
//		System.out.println("A");
//	}
//}
//
//interface B {
//	
//	default void print() {
//		System.out.println("B");
//	}
//}
//
//class C implements A, B {     //Duplicate default methods named print with the parameters () and () are inherited from the types B and A
//	
//	
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		
//	}
//
//}

//interface Arith {
//	
//	void add();
//	
//	void sub();
//	
//	default void multiply() {
//		System.out.println("mul of Super");
//	}
//}
//
//class Arithmet implements Arith {
//
//	@Override
//	public void add() {
//		System.out.println("add");
//	}
//
//	@Override
//	public void sub() {
//		System.out.println("sub");
//	}	
//	
//	public void multiply() {
//		System.out.println("mul of sub");
//	}
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Arith arith = new Arithmet();
//		
//		arith.add();    arith.sub();     arith.multiply();
//		
//	}
//
//}
