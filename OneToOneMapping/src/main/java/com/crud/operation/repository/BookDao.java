package com.crud.operation.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.crud.operation.entities.Book;

@Service
public class BookDao {
	@Autowired
	private BookRepository bookRepository;

	// get All Book
	public List<Book> getAllBook() {
		List<Book> book = null;
		try {
			book = (List<Book>) bookRepository.findAll();
		} catch (Exception e) {
			System.out.println(e);
		}

		return book;
	}

	// Get Single Book
	public Book getSingleBook(int id) {
		
		return bookRepository.findById(id).get() ;

	}

	// save Book
	public void saveBook(Book book) {

		bookRepository.save(book);

	}

	// delete Book
	public void deleteBook(int id) {
		bookRepository.deleteById(id);

	}

	// update book
	public void updateBook(Book book) {

		Book oldBook = bookRepository.findById(book.getId()).get();
		oldBook.setTitle(book.getTitle());
		oldBook.setAuthor(book.getAuthor());
		bookRepository.save(oldBook);

	}

}
