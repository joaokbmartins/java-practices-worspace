package com.joao.librarycrudspringjsp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.joao.librarycrudspringjsp.entities.Book;
import com.joao.librarycrudspringjsp.repositories.BookRepository;

public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository repo;

	@Override
	public Book findById(long id) {
		return this.repo.findById(id).orElse(null);
	}

	@Override
	public Book findByName(String name) {
		return this.repo.findByName(name);
	}

	@Override
	public List<Book> findAll() {
		return this.repo.findAll();
	}

}
