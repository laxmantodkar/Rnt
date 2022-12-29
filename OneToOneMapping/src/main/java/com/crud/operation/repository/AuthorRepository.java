package com.crud.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.operation.entities.Author;

public interface AuthorRepository  extends JpaRepository<Author, Integer>{

	public Author findByName(String name);
	public Author findById(int id);
}
