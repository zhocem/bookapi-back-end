package com.douviz.spring.service;

import java.util.List;

import com.douviz.spring.model.Book;

public interface BookService {
	
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
