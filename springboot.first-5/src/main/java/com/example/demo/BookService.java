package com.example.demo;

import java.util.List;
import java.util.Optional;

import com.example.demo.Book;
public interface BookService {


	public List<Book> getAllBooks();
	public Optional<Book> getBookById(Integer bookId);

}
