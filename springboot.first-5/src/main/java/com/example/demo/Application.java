package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.BookDAO;
import com.example.demo.Book;


@SpringBootApplication
public class Application  implements CommandLineRunner {

	private BookDAO bookDAO;
	
	@Autowired
	public Application(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		bookDAO.save(new Book(100,"ne-y..","Author-macha"));
		bookDAO.save(new Book(101,"shey","bidda"));
		bookDAO.save(new Book(102,"idendayya idhi","nellore"));
		bookDAO.save(new Book(103,"yegiri tantha","macha-updated"));
		bookDAO.save(new Book(104,"hai-prends","diffrent*"));
		bookDAO.save(new Book(105,"hai andi","uppalbal"));
	
	} 
}