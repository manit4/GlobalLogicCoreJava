package com.global;

import java.util.List;
import java.util.Scanner;

import com.global.service.BookService;
import com.global.service.UserService;
import com.global.to.BookTO;

public class Runner {

	public static void main(String[] args) throws Exception {
		
		UserService service = new UserService();
		BookService bookService = new BookService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 for Registration and 2 for login and 0 for exit");

		int mainMenuChoice = sc.nextInt();

		switch (mainMenuChoice) {

		case 1:

			service.register();

			break;

		case 2:

			if( service.login() == 1) {
				
				System.out.println("Welcome to Global Logic Book Store...");
				
				List<BookTO> books = bookService.getAllBooks();
				
				for(BookTO to : books) {
					
					System.out.println(to.getId()+", "+to.getName()+", "+to.getPrice());
					
				}
				
				
			}
			else {
				
				System.out.println("Wrong Credentials...");
			}
			break;
			
		case 0:
			System.out.println("Logged-out Successfully...");
		}

	}
	
	

}
