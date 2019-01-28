package com.douviz.spring.dao;

import java.util.List;

import com.douviz.spring.model.Book;

public interface BookDAO {

	// save the book
	long saveBook(Book book);
	
	// get single book
	Book getBook(long id);
	
	// get all books
	List<Book> GetBooks();
	
	// update a book
	void updateBook(long id, Book book);
	
	// delete a book
	void deleteBook(long id);
	
}
