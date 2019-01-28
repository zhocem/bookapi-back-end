package com.douviz.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douviz.spring.dao.BookDAO;
import com.douviz.spring.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDao;
	
	@Override
	@Transactional
	public long saveBook(Book book) {
		
		return bookDao.saveBook(book);
	}

	@Override
	public Book getBook(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Book> GetBooks() {
		return bookDao.GetBooks();
	}

	@Override
	public void updateBook(long id, Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(long id) {
		// TODO Auto-generated method stub

	}

}
