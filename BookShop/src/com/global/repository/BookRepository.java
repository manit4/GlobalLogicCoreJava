package com.global.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.global.db.DBConnection;
import com.global.to.BookTO;

public class BookRepository {
	
	Connection connection  = DBConnection.getConnection();
	
	public List<BookTO> findAllBooks() {
		
		List<BookTO> books = new ArrayList<BookTO>();
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from book");
			
			ResultSet resultSet =  statement.executeQuery();
			while(resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				int price = resultSet.getInt(3);
				
				BookTO bookTO = new BookTO(id, name, price);
				books.add(bookTO);
			}
			
		}
		
		catch (Exception e) {
			System.out.println("inside catch of BooKRepo");
		}
		
		return books;
		
		
	}

}
