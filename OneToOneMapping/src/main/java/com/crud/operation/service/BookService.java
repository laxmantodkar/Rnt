package com.crud.operation.service;

import java.lang.invoke.CallSite;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.operation.entities.Book;
import com.crud.operation.repository.BookDao;

@Service
public class BookService {
	@Autowired
	private BookDao bookDao;
	Book book = new Book();

	// get All Book
	public List<Book> getAllBook() {

		List<Book> book = bookDao.getAllBook();
		return book;
	}

	// Get single Book
	public Book getSingleBook(int id) {
		return bookDao.getSingleBook(id);
	}

	// save list of Book
	public void saveBook(Book book) {
		bookDao.saveBook(book);
	}

	// delete Book
	public void deleteBook(int id) {

		bookDao.deleteBook(id);
	}

	// update book
	public void updateBook(Book book) {
		bookDao.updateBook(book);

	}

}
