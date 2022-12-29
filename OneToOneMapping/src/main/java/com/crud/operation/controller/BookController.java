package com.crud.operation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.crud.operation.entities.Book;
import com.crud.operation.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;

	// Get all Book
	@GetMapping("/getAllBook")
	public ResponseEntity<List<Book>> getAllBook() {
		List<Book> book = bookService.getAllBook();
		System.out.println();
		if (book.size() == 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));


	}
	
	//Get Single Book
	 @GetMapping("/getSingleBook/{id}")
	 public ResponseEntity<Book> getSinglEntityBook(@PathVariable("id") int id)
	 {
		 Book book = bookService.getSingleBook(id);
		 System.out.println(book);
		 if (book==null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
//			return ResponseEntity.of(Optional.of(book));
//		 return ResponseEntity.ok(book);
		 return new ResponseEntity<Book>(book, HttpStatus.OK);
	 }

	// Save Single Book
	@PostMapping("/saveBook")
	public ResponseEntity<String> saveBook(@RequestBody Book book) {
		System.out.println(book);
		bookService.saveBook(book);
		return new ResponseEntity<String>("Save Successfully", HttpStatus.ACCEPTED);
	}
	// Save Multiple Book

	@PostMapping("/savelistofBook")
	public ResponseEntity<String> saveAllBook(@RequestBody List<Book> books) {
		for (Book book2 : books) {

			bookService.saveBook(book2);
		}
		return new ResponseEntity<String>("Save Successfully", HttpStatus.ACCEPTED);
	}

	// Delete Book
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable("id") int id) {
		bookService.deleteBook(id);

		return new ResponseEntity<String>("Delete Successfully", HttpStatus.ACCEPTED);
	}

	// Update Student
	@PutMapping("/updateBook")
	public ResponseEntity<String> updateUpdate(@RequestBody Book book) {
		bookService.updateBook(book);

		return new ResponseEntity<String>("update Successfully", HttpStatus.ACCEPTED);
	}

}
