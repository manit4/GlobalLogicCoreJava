package com.global;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IO {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\batch1\\data.txt");
		
		FileReader reader = new FileReader(file);
		
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String data = null;
		
		while((data = bufferedReader.readLine()) != null) {
			
			System.out.println(data);
		}
		
	}
}

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
//
//public class IO {
//	
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\batch1\\data.txt");
//		
//		FileWriter writer = new FileWriter(file);
//		
//		char[] characters = {'M', 'y', 'n', 'a', 'm', 'e'}; 
//		
//		writer.write(characters);
//		
//		writer.flush();
//	}
//}



//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileReader;
//
//public class IO {
//	
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\batch1\\data.txt");
//		
//		FileInputStream reader = new FileInputStream(file);
//		
//		int value = 0;
//		
//		while( (value = reader.read()) != -1) {
//			
//			char val = (char)value;
//			
//			System.out.print(val);
//		}	
//	}
//}

//import java.io.File;
//import java.io.FileReader;
//
//public class IO {
//	
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Desktop\\batch1\\data.txt");
//		
//		FileReader reader = new FileReader(file);
//		
//		int value = 0;
//		
//		while( (value = reader.read()) != -1) {
//			
//			char val = (char)value;
//			
//			System.out.print(val);
//		}
//			
//		
//	}
//
//}
