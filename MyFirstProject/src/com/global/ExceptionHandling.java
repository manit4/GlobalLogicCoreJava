package com.global;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class ExceptionHandling {

	public static void main(String[] args) throws NoDivisibleBy10Checked {
		
		
			
			checkingDivisibility();
		

	}

	static public void checkingDivisibility() throws NoDivisibleBy10Checked{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any no!!");

		int number = sc.nextInt();

		if (number % 10 == 0) {

			throw new NoDivisibleBy10Checked();
		}

		System.out.println("Success");
	}
}


//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			checkingDivisibility();
//		}
//		catch (NoDivisibleBy10Checked e) {
//			e.printStackTrace();
//		}
//		
//
//	}
//
//	static public void checkingDivisibility() throws NoDivisibleBy10Checked{
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter any no!!");
//
//		int number = sc.nextInt();
//
//		if (number % 10 == 0) {
//
//			throw new NoDivisibleBy10Checked();
//		}
//
//		System.out.println("Success");
//	}
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		
//		checkingDivisibility();
//
//	}
//
//	static public void checkingDivisibility() {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter any no!!");
//
//		int number = sc.nextInt();
//
//		if (number % 10 == 0) {
//
//			throw new NoDivisibleBy10();
//		}
//
//		System.out.println("Success");
//	}
//}

//
//import java.io.File;
//import java.io.FileReader;
//import java.util.Scanner;
//
//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter any no!!");
//		
//		int number = sc.nextInt();
//		
//		if(number % 10 == 0) {
//			
//			throw new NoDivisibleBy10();
//		}
//		
//		System.out.println("Success");
//
//	}
//
//}

//import java.io.File;
//import java.io.FileReader;
//
//public class ExceptionHandling {
//
//	public static void main(String[] args) throws Exception {
//		
//		throw new ArithmeticException();
//
//	}
//
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) throws Exception {
//		
//		
//			
//			fileReading();
//		
//	
//	}
//	
//	static void fileReading() throws Exception {
//		
//		
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\batch1\\data.txt");
//			
//			FileReader reader = new FileReader(file);
//			
//			int value = reader.read();
//			
//			System.out.println((char)value);
//			
//		}
//		
//	}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			fileReading();
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//	
//	}
//	
//	static void fileReading() throws Exception {
//		
//		
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\batch1\\data.txt");
//			
//			FileReader reader = new FileReader(file);
//			
//			int value = reader.read();
//			
//			System.out.println((char)value);
//			
//		}
//		
//	}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		
//		
//			
//			fileReading();
//		
//
//		
//	}
//	
//	static void fileReading() {
//		
//		try {
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\batch1\\data.txt");
//			
//			FileReader reader = new FileReader(file);
//			
//			int value = reader.read();
//			
//			System.out.println((char)value);
//			
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
//
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) throws Exception{
//		
//		
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\batch1\\data.txt");
//			
//			FileReader reader = new FileReader(file);
//			
//			int value = reader.read();
//			
//			System.out.println((char)value);
//		
//
//		
//	}
//
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\batch1\\data.txt");
//			
//			FileReader reader = new FileReader(file);
//			
//			int value = reader.read();
//			
//			System.out.println((char)value);
//		}
//		
//		catch (Exception e) {
//			
//			e.printStackTrace();
//			
//		}
//		
//		
//
//		
//	}
//
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//
//		try {
//
//			int i = 100;
//			String name = "Anurag";
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter divider!!");
//
//			int number = sc.nextInt();
//
//			int result = i / number;
//
//			System.out.println("Enter any index which you would like to access!!");
//
//			int index = sc.nextInt();
//
//			char character = name.charAt(index);
//
//			System.out.println(result);
//			System.out.println(character);
//		}
//		
//		
//		catch (Exception e) {
//
//			e.printStackTrace();
//			System.out.println("Do not enter 0 as divider");
//			main(null);
//		}
//		
//		catch (Exception e) {
//			e.printStackTrace();
//			main(null);
//		}
//
//	}
//
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//
//		try {
//
//			int i = 100;
//			String name = "Anurag";
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter divider!!");
//
//			int number = sc.nextInt();
//
//			int result = i / number;
//
//			System.out.println("Enter any index which you would like to access!!");
//
//			int index = sc.nextInt();
//
//			char character = name.charAt(index);
//
//			System.out.println(result);
//			System.out.println(character);
//		}
//		
//		
//		catch (Exception e) {
//
//			e.printStackTrace();
//			System.out.println("Do not enter 0 as divider");
//			main(null);
//		}
//		
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//			main(null);
//		}
//
//	}
//
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//
//		try {
//
//			int i = 100;
//			String name = "Anurag";
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter divider!!");
//
//			int number = sc.nextInt();
//
//			int result = i / number;
//
//			System.out.println("Enter any index which you would like to access!!");
//
//			int index = sc.nextInt();
//
//			char character = name.charAt(index);
//
//			System.out.println(result);
//			System.out.println(character);
//		}
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//			main(null);
//		}
//		
//		catch (Exception e) {
//
//			e.printStackTrace();
//			System.out.println("Do not enter 0 as divider");
//			main(null);
//		}
//
//	}
//
//}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			divideNumber();
//			charAccess();
//		}
//		catch (ArithmeticException e) {
//			divideNumber();
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			charAccess();
//		}
//		
//		
//		
//
//	}
//
//	static void divideNumber() {
//		
//		
//			
//			int i = 100;
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter divider!!");
//
//			int number = sc.nextInt();
//
//			int result = i / number;
//			System.out.println(result);
//			charAccess();
//			
//		}
//	
//
//	static void charAccess() {
//		
//		
//			
//			Scanner sc = new Scanner(System.in);
//
//			String name = "Anurag";
//
//			System.out.println("Enter any index which you would like to access!!");
//
//			int index = sc.nextInt();
//
//			char character = name.charAt(index);
//
//			System.out.println(character);
//		
//	}

//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		
//		divideNumber();
//		
//
//	}
//
//	static void divideNumber() {
//		
//		try {
//			
//			int i = 100;
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter divider!!");
//
//			int number = sc.nextInt();
//
//			int result = i / number;
//			System.out.println(result);
//			charAccess();
//			
//		}
//		catch (ArithmeticException e) {
//			divideNumber();
//		}
//
//		
//
//	}
//
//	static void charAccess() {
//		
//		try {
//			
//			Scanner sc = new Scanner(System.in);
//
//			String name = "Anurag";
//
//			System.out.println("Enter any index which you would like to access!!");
//
//			int index = sc.nextInt();
//
//			char character = name.charAt(index);
//
//			System.out.println(character);
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			charAccess();
//		}
//	}

//public class ExceptionHandling {
//
//public static void main(String[] args) {
//	
//	try {
//		
//		int i = 100;
//		String name = "Anurag";
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter divider!!");
//		
//		int number = sc.nextInt();
//		
//		int result = i/number;
//		
//		System.out.println("Enter any index which you would like to access!!");
//		
//		int index = sc.nextInt();
//		
//		char character = name.charAt(index);
//		
//		System.out.println(result);
//		System.out.println(character);
//	}
//	catch(ArithmeticException e) {
//		
//		System.out.println("Do not enter 0 as divider");
//		main(null);
//	}
//	catch (StringIndexOutOfBoundsException e) {
//		System.out.println("Do not give any index out of range!!");
//		main(null);
//	}
//	
//	
//}

//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		try {
//			
//			int i = 100;
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter divider!!");
//			
//			int number = sc.nextInt();
//			
//			int result = i/number;
//			
//			System.out.println(result);
//		}
//		catch(Exception e) {
//			
//			e.printStackTrace();
//			System.out.println("Do not enter 0 as divider");
//			main(null);
//		}
//		
//		
//	}
//
//}

//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		
//		try {
//			
//			int i = 100;
//			String name = "Anurag";
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter divider!!");
//			
//			int number = sc.nextInt();
//			
//			int result = i/number;
//			
//			System.out.println("Enter any index which you would like to access!!");
//			
//			int index = sc.nextInt();
//			
//			char character = name.charAt(index);
//			
//			System.out.println(result);
//			System.out.println(character);
//		}
//		catch(Exception e) {
//			
//			e.printStackTrace();
//			System.out.println("Do not enter 0 as divider");
//		}
//		
//		
//	}
//
//}
