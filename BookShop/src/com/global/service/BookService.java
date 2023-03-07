package com.global.service;


import java.util.List;

import com.global.repository.BookRepository;
import com.global.to.BookTO;

public class BookService {
	
	BookRepository bookRepository = new BookRepository();
	
	public List<BookTO> getAllBooks() {
		
		return bookRepository.findAllBooks();	
	}

}
