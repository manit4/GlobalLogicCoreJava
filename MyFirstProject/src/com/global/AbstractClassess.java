package com.global;


abstract class Car {

	static void tyres() {

		System.out.println("inside tyres");
	}

}


public class AbstractClassess {

	public static void main(String[] args) {

		Car.tyres();//since I can not instantiate Car class however, I can access the static member by class name...
		
		

	}
}



//abstract class Car {
//
//	void tyres() {
//
//		System.out.println("inside tyres");
//	}
//
//}
//
//class Polo extends Car {
//
//	void abs() {
//
//		System.out.println("inside abs");
//	}
//
//	void musicSystem() {
//		
//		System.out.println("inside musicSystem of Poloss");
//	}
//}
//
//public class AbstractClassess {
//
//	public static void main(String[] args) {
//
//		Car polo = new Polo();
//		
//		polo.musicSystem();//this is illegal because of compile-time polymorphism...
//
//	}
//}


//abstract class Car {
//
//	void tyres() {
//
//		System.out.println("inside tyres");
//	}
//
//	void musicSystem() {
//		System.out.println("inside musicSystem of Car");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//
//		System.out.println("inside abs");
//	}
//
//	void musicSystem() {
//		
//		System.out.println("inside musicSystem of Poloss");
//	}
//}
//
//public class AbstractClassess {
//
//	public static void main(String[] args) {
//
//		Car polo = new Polo();
//		
//		polo.musicSystem();
//
//	}
//}


//abstract class Car {
//
//	void tyres() {
//
//		System.out.println("inside tyres");
//	}
//
//	abstract void musicSystem();
//}
//
//class Polo extends Car {
//
//	void abs() {
//
//		System.out.println("inside abs");
//	}
//
//	void musicSystem() {
//		
//		System.out.println("inside musicSystem of Poloss");
//	}
//}
//
//public class AbstractClassess {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();
//		
//		polo.abs();    polo.musicSystem();    polo.tyres();
//		
//		Car car = new Polo();
//		
//		car.musicSystem();     car.tyres();      //car.abs();This is illegal, calling abs on car reference
//													//variable is illegal...
//
//	}
//}


//abstract class Car {
//
//	void tyres() {
//
//		System.out.println("inside tyres");
//	}
//
//	void musicSystem() {
//		System.out.println("inside musicSystem");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//
//		System.out.println("inside abs");
//	}
//}
//
//public class AbstractClassess {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();
//		
//		polo.abs();    polo.musicSystem();    polo.tyres();
//
//	}
//}

//abstract class Car {// this shows, abstract class does not have abstract methods and you can not
//					// create object
//					// of abstract class...
//
//	void tyres() {
//
//		System.out.println("inside tyres");
//	}
//
//	void musicSystem() {
//
//	}
//}
//
//class Polo {
//
//	void abs() {
//
//		System.out.println("inside abs");
//	}
//}
//
//public class AbstractClassess {
//
//	public static void main(String[] args) {
//
//		Car car = new Car();// you can not instantiate abstract class...
//
//	}
//}

//
//abstract class Car {//Abstract classes can have both abstract methods and non-abstract methods
//	
//	void tyres() {
//		
//		System.out.println("inside tyres");
//	}
//	abstract void musicSystem();
//}
//
//class Polo {
//	
//	void abs() {
//		
//		System.out.println("inside abs");
//	}
//}
//
//public class AbstractClassess {
//	
//	public static void main(String[] args) {
//		
//	}
//}