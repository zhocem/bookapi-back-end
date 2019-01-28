package com.douviz.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.douviz.spring.model.Book;
import com.douviz.spring.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	// get all the books
	@GetMapping("/api/books")
	public ResponseEntity<List<Book>> getBooks() {

		List<Book> books = bookService.GetBooks();
		return ResponseEntity.ok().body(books);
	}

	// save book
	@PostMapping("/api/save")
	public ResponseEntity<?> saveBook(@RequestBody Book book) {
		long id = bookService.saveBook(book);
		return ResponseEntity.ok().body("Book created with id: " + id);
	}

	// get single boog using id
	@GetMapping("/api/book/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") long id) {
		Book book = bookService.getBook(id);
		return ResponseEntity.ok().body(book);
	}

	// delete book with id
	@DeleteMapping("/api/delete/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable("id") long id) {
		bookService.deleteBook(id);
		return ResponseEntity.ok().body("The book with id: " + id + " is deleted");
	}

	// update book
	@PutMapping("/api/book/{id}")
	public ResponseEntity<?> updateBook(@PathVariable("id") long id, @RequestBody Book book) {
		bookService.updateBook(id, book);
		return ResponseEntity.ok().body("Book with id: " + id + " has been updated.");
	}

}
