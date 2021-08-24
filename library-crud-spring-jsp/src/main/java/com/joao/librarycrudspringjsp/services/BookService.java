package com.joao.librarycrudspringjsp.services;

import java.util.List;

import com.joao.librarycrudspringjsp.entities.Book;

public interface BookService {

	public Book findById(long id);

	public Book findByName(String name);

	public List<Book> findAll();
	

}
