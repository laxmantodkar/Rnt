package com.crud.operation.entities;

public class AuthorDto1 
{
	private int id;
	private String name;
	private String lang;
	private Book book;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		
		this.book = book;
	}
	
	
	
	
}
