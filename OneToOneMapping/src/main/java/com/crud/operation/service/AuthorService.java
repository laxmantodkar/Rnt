package com.crud.operation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.operation.entities.Author;
import com.crud.operation.entities.AuthorDto1;
import com.crud.operation.method.AuthorDto;
import com.crud.operation.repository.AuthorDao;

@Service
public class AuthorService {

	@Autowired
	private AuthorDao authorDao;

	AuthorDto authorDto = new AuthorDto();

	// get all author
	public List<AuthorDto1> getAllAuthor() {
		List<Author> dbAuthor = authorDao.getAllAuthor();
		List<AuthorDto1> listAuthor = authorDto.dtoMethod(dbAuthor);
		return listAuthor;

	}

	// save Author
	public void saveAuthor(Author author) {
           authorDao.saveAuthor(author);

	}

}
