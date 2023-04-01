package com.gl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Tea {

	Tea() {
		System.out.println("inside Tea constructor");
	}

	public void prepareTea() {

		System.out.println("Your Tea is being prepared..");
	}
}

class Restaurant {

	@Autowired
	Tea tea;

	public Restaurant() {
		System.out.println("inside Restaurant constr...");
	}

	public Restaurant(Tea tea) {
		super();
		this.tea = tea;
	}

	public void placeOrder() {

		tea.prepareTea();
	}
}

public class Main {

	public static void main(String[] args) {

		System.out.println("inside sop");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/gl/beans.xml");

		Restaurant restaurant = (Restaurant) context.getBean("restaurant");

		restaurant.placeOrder();

	}

}

//class Restaurant {
//	
//	String name;
//	
//	public Restaurant() {
//		System.out.println("inside no-arg constr...");
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void prepareTea() {
//		
//		System.out.println("Your Tea is being prepared..."+name);
//	}	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		System.out.println("inside sop");
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//		Restaurant restaurant1 = (Restaurant) context.getBean("restaurantBean");
////		
////		restaurant1.name = "XYZ Restaurant Chains...";
////
////		restaurant1.prepareTea();
////		
////		Restaurant restaurant2 = (Restaurant) context.getBean("restaurantBean");
////		
////		restaurant2.prepareTea();
//
//	}
//
//}

//class Tea {
//	
//	Tea() {
//		System.out.println("inside Tea constructor");
//	}
//	
//	public void prepareTea() {
//		
//		System.out.println("Your Tea is being prepared..");
//	}
//}
//
//class Restaurant {
//	
//	Tea tea;
//	
//	public Restaurant() {
//		System.out.println("inside Restaurant constr...");
//	}
//	
//	public Restaurant(Tea tea) {
//		super();
//		this.tea = tea;
//	}
//
//	public void placeOrder() {
//		
//		tea.prepareTea();
//	}	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		System.out.println("inside sop");
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
//
//		restaurant.placeOrder();
//
//	}
//
//}

//class Tea {
//	
//	Tea() {
//		System.out.println("inside Tea constructor");
//	}
//	
//	public void prepareTea() {
//		
//		System.out.println("Your Tea is being prepared..");
//	}
//}
//
//class Restaurant {
//	
//	Tea tea;
//	
//	public Restaurant() {
//		System.out.println("inside Restaurant constr...");
//	}
//	
//	public Restaurant(Tea tea) {
//		super();
//		this.tea = tea;
//	}
//
//	public void placeOrder() {
//		
//		tea.prepareTea();
//	}	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		System.out.println("inside sop");
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
//
//		restaurant.placeOrder();
//		
//
////		Restaurant restaurant = new Restaurant();
////		
////		restaurant.prepareTea();
//	}
//
//}

//class Restaurant {
//
//	String name;
//
//	public Restaurant(String name) {
//		System.out.println("inside parameterized constructor...");
//		this.name = name;
//	}
//
//	void prepareTea() {
//
//		System.out.println("Your Tea is being prepared and the restaurant name is " + name);
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		System.out.println("inside sop");
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
//
//		restaurant.prepareTea();
//
////		Restaurant restaurant = new Restaurant();
////		
////		restaurant.prepareTea();
//	}
//
//}

//class Restaurant {
//	
//	String name;
//
//	Restaurant() {
//	System.out.println("inside constructor...");
//}
//
//	public void setName(String name) {
//		System.out.println("inside setter");
//		this.name = name;
//	}
//
//	void prepareTea() {
//		
//		System.out.println("Your Tea is being prepared and the restaurant name is "+name);
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		System.out.println("inside sop");
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		
//		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
//		
//		restaurant.prepareTea();
//		
//		
////		Restaurant restaurant = new Restaurant();
////		
////		restaurant.prepareTea();
//	}
//
//}

//class Restaurant {
//	
//	Restaurant() {
//		System.out.println("inside constructor...");
//	}
//	
//	void prepareTea() {
//		
//		System.out.println("Your Tea is being prepared...");
//	}
//}
//
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		System.out.println("inside sop");
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		
//		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
//		
//		restaurant.prepareTea();
//		
//		
////		Restaurant restaurant = new Restaurant();
////		
////		restaurant.prepareTea();
//	}
//
//}
