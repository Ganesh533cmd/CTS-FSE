package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public interface BookDAO extends JpaRepository<Book, Integer>{

	public List<Book> findByAuthor(String author);
	public List<Book> findByBookName(String bookName);
	
	public List<Book> findByAuthorAndBookName(String author,String bookName);
}