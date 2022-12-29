package com.crud.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.operation.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
