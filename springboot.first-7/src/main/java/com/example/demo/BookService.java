package com.example.demo;

import java.util.List;
import java.util.Optional;
public interface BookService {


	public List<Book> getAllBooks();
	public Optional<Book> getBookById(Integer bookId);
	Book createBook(Book book);
	public void deleteBookById(Integer bookId);
	public void deleteAll();
	public List<Book> findByAuthor(String author);
	public List<Book> findByBookName(String bookName);
	public List<Book> findByAuthorAndBookName(String author, String bookName);
}
