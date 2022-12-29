package com.crud.operation.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.operation.entities.Author;
import com.crud.operation.entities.AuthorDto1;
import com.crud.operation.entities.Book;

import com.crud.operation.repository.AuthorRepository;
import com.crud.operation.repository.BookRepository;
import com.crud.operation.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	//Get All Author
	@GetMapping("/getAllAuthor")
	public ResponseEntity<List<AuthorDto1>> getAllAuthor()
	{
		List<AuthorDto1> author = authorService.getAllAuthor();
		
		return ResponseEntity.of(Optional.of(author));
	}
	
	//Add Author
	@PostMapping("/add")
	public ResponseEntity<String> addAuthor(@RequestBody Author author)
	{
		authorService.saveAuthor(author);
		return  new ResponseEntity<String>("Add Successufully",HttpStatus.ACCEPTED);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired
//	private AuthorRepo authorRepo;
//
//	@Autowired
//	private BookRepository bookRepo;
//
//	@PostMapping("/add")
//	public ResponseEntity<String> saveAuthor(@RequestBody Author author) {
//		
//		
//		authorRepo.save(author);
//
//		
//		return new ResponseEntity<String>("Author saved ", HttpStatus.CREATED);
//	}
//	@PutMapping("/addBook")
//	public ResponseEntity<String> assignBook(@RequestBody Author author){
//		Author olAuthor=authorRepo.findById(author.getId());
//		System.out.println(author.toString());
//		
//		if(olAuthor!=null) {
//			List<Book> oldList=olAuthor.getBooks();
//			List<Book> newList=new ArrayList<>();
//			for (Book b:author.getBooks()) {
//				Book isBook=bookRepo.findById(b.getId());
//				if(isBook!=null) {
//					isBook.setAuthor(olAuthor);
//					oldList.add(isBook);
//				}else {
//					return new ResponseEntity<String>("Book Not Found ", HttpStatus.NOT_FOUND);
//				}
//				
//			}
//			olAuthor.setBooks(oldList);
//			authorRepo.save(olAuthor);
//			return new ResponseEntity<String>("Successully added Book ", HttpStatus.CREATED);
//		}else {
//			return new ResponseEntity<String>("Author Not Found ", HttpStatus.CREATED);
//		}
//	}
//	
//	@GetMapping("/getAll")
//	public ResponseEntity<List<AuthorDTO>> getAllAuthor(){
//		DtoMethods dto=new DtoMethods();
//		List<Author> list1=authorRepo.findAll();
//		List<AuthorDTO> list=dto.getAuthorDTOs(list1);
//		return ResponseEntity.of(Optional.of(list));
//	}

}
