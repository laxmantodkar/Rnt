package com.crud.operation.method;

import java.util.ArrayList;
import java.util.List;

import com.crud.operation.entities.Author;
import com.crud.operation.entities.AuthorDto1;
import com.crud.operation.entities.Book;

public class AuthorDto {

	List<AuthorDto1> newList=new ArrayList<>();
	public List<AuthorDto1> dtoMethod(List<Author> DbAuthor) 
	{
	
		for(Author a:DbAuthor)
		{
			AuthorDto1 authorDto1=new AuthorDto1();
			authorDto1.setId(a.getId());
			authorDto1.setName(a.getName());
			authorDto1.setLang(a.getLang());
			authorDto1.setBook(a.getBook());
			newList.add(authorDto1);
		}
		return newList;
		
	
	}
		
		
		
		
	
//		
//		List<AuthorDto1> newList = new ArrayList<>();
//		for (Author a : DbAuthor) {
//			AuthorDto1 ob = convert(a);
//			newList.add(ob);
//		}
//
//		return newList;
//
//	}
//
//	public AuthorDto1 convert(Author author) {
//		AuthorDto1 authorDto1 = new AuthorDto1();
//		authorDto1.setId(author.getId());
//		authorDto1.setName(author.getName());
//		authorDto1.setLang(author.getLang());
//		authorDto1.setBook(author.getBook());
//		return authorDto1;
//
//	}

}
