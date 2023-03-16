package com.global;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String name;
	double salary;
	int exp;

	public Employee(String name, double salary, int exp) {
		super();
		this.name = name;
		this.salary = salary;
		this.exp = exp;

	}

	public boolean equals(Object emp) {
		System.out.println("inside equals");
		if(salary == ((Employee) emp).salary)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode() {
		System.out.println("hashCode");
		return 0;
	}

}

public class Streams {

	public static void main(String[] args) {

//		List<String> values = new ArrayList<String>();
//		List<String> newValues = new ArrayList<String>();
//
//		values.add("Chhavi");
//		values.add("Mayur");
//		values.add("Ritesh");
//		values.add("Anya");
//		values.add("Mayur");
//
//		String smallestName = values.stream().max((val1, val2) -> {
//			
//			return val1.compareTo(val2);
//		}).get();
//				
//		
//		System.out.println(smallestName);

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Saksham", 8000, 5));
		list.add(new Employee("Vivek", 8000, 6));
		list.add(new Employee("Saksham", 7000, 7));

		list.stream().distinct().forEach(l -> System.out.println(l.name));

	}

}

//public class Streams {
//
//	public static void main(String[] args) {
//
//		List<String> values = new ArrayList<String>();
//		List<String> newValues = new ArrayList<String>();
//
//		values.add("Chhavi");
//		values.add("Mayur");
//		values.add("Ritesh");
//		values.add("Anya");
//		values.add("Mayur");
//
//		String smallestName = values.stream().min((val1, val2) -> {
//			
//			return val1.compareTo(val2);
//		}).get();
//				
//		
//		System.out.println(smallestName);
//
//	}
//
//}

//public class Streams {
//
//	public static void main(String[] args) {
//
//		List<String> values = new ArrayList<String>();
//		List<String> newValues = new ArrayList<String>();
//
//		values.add("Chhavi");
//		values.add("Mayur");
//		values.add("Ritesh");
//		values.add("Anya");
//		values.add("Mayur");
//
//		newValues = values.stream().distinct().sorted().collect(Collectors.toList());
//				
//		
//		System.out.println(newValues);
//
//	}
//
//}

//public class Streams {
//
//	public static void main(String[] args) {
//
//		List<String> values = new ArrayList<String>();
//		List<String> newValues = new ArrayList<String>();
//
//		values.add("chhavi");
//		values.add("Mayur");
//		values.add("Ritesh");
//		values.add("Anya");
//		values.add("Mayur");
//
//		long size = values.stream().distinct().count();
//				
//		
//		System.out.println(size);
//
//	}
//
//}

//public class Streams {
//
//	public static void main(String[] args) {
//
//		List<String> values = new ArrayList<String>();
//		List<String> newValues = new ArrayList<String>();
//
//		values.add("chhavi");
//		values.add("Mayur");
//		values.add("Ritesh");
//		values.add("Anya");
//		values.add("Mayur");
//
//		newValues = values.stream().distinct().collect(Collectors.toList());
//		
//		System.out.println(newValues);
//
//	}
//
//}

//public class Streams {
//
//	public static void main(String[] args) {
//
//		List<String> values = new ArrayList<String>();
//		List<String> newValues = new ArrayList<String>();
//
//		values.add("chhavi");
//		values.add("Mayur");
//		values.add("Ritesh");
//		values.add("Anya");
//		values.add("Mayur");
//
//		for (String x : values) {
//			if (newValues.contains(x)) {
//				continue;
//			} else {
//				newValues.add(x);
//			}
//
//		}
//		System.out.println(newValues);
//
//	}
//
//}

//public class Streams {
//	static String temp = "";
//
//	public static void main(String[] args) {
//
//		List<String> values = new ArrayList<String>();
//		List<String> newValues = new ArrayList<String>();
//
//		values.add("chhavi");
//		values.add("Mayur");
//		values.add("Ritesh");
//		values.add("Anya");
//
//		newValues = values.stream().map(val -> {
//			temp = temp + val;
//			return temp;
//		}).collect(Collectors.toList());
//
//		System.out.println(newValues);
//
//	}
//
//}

//public class Streams {
//
//	public static void main(String[] args) {
//
//		List<Integer> values = new ArrayList<Integer>();
//		List<Integer> newValues = new ArrayList<Integer>();
//
//		values.add(39);
//		values.add(22);
//		values.add(54);
//		values.add(65);
//		
//		newValues = values.stream().map( value -> {
//			
//			int temp = 0;
//			
//			if(value % 2 == 0) {
//				temp = value + 10;
//			}
//			else {
//				temp = value + 5;
//			}
//			return temp;
//		}).collect(Collectors.toList());
//
//		
//		System.out.println(newValues);
//
//	}
//
//}

//public class Streams {
//
//	public static void main(String[] args) {
//
//		List<Integer> values = new ArrayList<Integer>();
//		List<Integer> newValues = new ArrayList<Integer>();
//
//		values.add(39);
//		values.add(22);
//		values.add(54);
//		values.add(65);
//
//		for( int value : values) {
//			
//			if( value % 2 == 0) {
//				
//				newValues.add(value + 10);
//			}
//			else {
//				
//				newValues.add(value + 5);
//			}
//		}
//		
//		System.out.println(newValues);
//
//	}
//
//}

//class Employee{
//	String name;
//	double salary;
//	int exp;
//	public Employee(String name, double salary, int exp) {
//		super();
//		this.name = name;
//		this.salary = salary;
//		this.exp = exp;
//	}
//	
//}
//public class Streams {
//	
//	public static void main(String[] args) {
//		
////		List<Integer> values = new ArrayList<Integer>();
//////		List<Integer> oddValues = new ArrayList<Integer>();
//		
//		List<Employee> emp =new ArrayList<Employee>();
////		List<Employee> emp1 =new ArrayList<Employee>();
//		emp.add(new Employee("aman",10000,6));
//		emp.add(new Employee("ankit",100000,4));
//		emp.add(new Employee("akhil",200000,6));
////		
////		values.add(39);    values.add(22);    values.add(54);    values.add(65);
//		
//		emp.stream().map( employee ->{
//			ArrayList<Object> arr = new ArrayList<>();
//			if(employee.exp<5)
//			{
//				arr.add(employee.name);
//				arr.add(employee.salary*0.5);
//			}
//			else
//			{
//				arr.add(employee.name);
//				arr.add(employee.salary*0.8);
//			}
//			return arr;
//				
//			
//		}).forEach(arr->System.out.println("Hi " + arr.get(0) + "!" + "Your salary now is "+ arr.get(1)));
//
//	}
//
//}

//public class Streams {
//
//	public static void main(String[] args) {
//
//		List<Integer> values = new ArrayList<Integer>();
//		List<Integer> oddValues = new ArrayList<Integer>();
//
//		values.add(39);
//		values.add(22);
//		values.add(54);
//		values.add(65);
//
//		values.stream().filter(value -> value % 2 != 0).forEach(filteredValue -> System.out.println(filteredValue));
//
//	}
//
//}

//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> values = new ArrayList<Integer>();
//		List<Integer> oddValues = new ArrayList<Integer>();
//		
//		values.add(39);    values.add(22);    values.add(54);    values.add(65);
//		
//		oddValues = values.stream().filter(value -> value % 2 != 0).collect(Collectors.toList());
//		
//		System.out.println(oddValues);
//	}
//
//}

//public class Streams {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> values = new ArrayList<Integer>();
//		List<Integer> oddValues = new ArrayList<Integer>();
//		
//		values.add(39);    values.add(22);    values.add(54);    values.add(65);
//		
//		for(int value : values) {
//			
//			if( value % 2 != 0) {
//				
//				oddValues.add(value);
//			}
//		}
//		
//		System.out.println(oddValues.toString());
//	}
//
//}
