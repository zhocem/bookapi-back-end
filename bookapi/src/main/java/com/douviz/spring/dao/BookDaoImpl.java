package com.douviz.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douviz.spring.model.Book;

@Repository
public class BookDaoImpl implements BookDAO {

	// inect he session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long saveBook(Book book) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(book);

		return book.getId();
	}

	@Override
	public Book getBook(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> GetBooks() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Book> query = currentSession.createQuery("from Book order by title", Book.class);
		
		List<Book> books = query.getResultList();
		
		return books;

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
