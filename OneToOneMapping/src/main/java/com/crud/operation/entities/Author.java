package com.crud.operation.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String lang;

//	@OneToMany(mappedBy = "author",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JsonBackReference
	// private List<Book> books;
	@OneToOne(mappedBy = "author", fetch = FetchType.LAZY)
	@JsonBackReference
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author(Integer id, String name, String lang, Book book) {
		this.id = id;
		this.name = name;
		this.lang = lang;
		this.book = book;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public List<Book> getBooks() {
//		return books;
//	}

//	public void setBooks(List<Book> books) {
//		this.books = books;
//	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", lang=" + lang + ", book="  + "]";
	}

}
