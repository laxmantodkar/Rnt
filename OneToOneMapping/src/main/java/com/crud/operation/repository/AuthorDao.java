package com.crud.operation.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.operation.entities.Author;

@Repository
public class AuthorDao {

	@Autowired
	private AuthorRepository authorRepository;

	// Get All Author
	public List<Author> getAllAuthor() {
		List<Author> author = authorRepository.findAll();
		return author;
	}

	// save Author
	public void saveAuthor(Author author) {
           authorRepository.save(author);
	}

}
