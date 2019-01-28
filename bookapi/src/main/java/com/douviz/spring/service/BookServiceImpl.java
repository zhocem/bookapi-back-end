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
	@Transactional
	public Book getBook(long id) {
		return bookDao.getBook(id);
	}

	@Override
	@Transactional
	public List<Book> GetBooks() {
		return bookDao.GetBooks();
	}

	@Override
	@Transactional
	public void updateBook(long id, Book book) {
		bookDao.updateBook(id, book);
	}

	@Override
	@Transactional
	public void deleteBook(long id) {
		bookDao.deleteBook(id);
	}

}
