package com.joao.librarycrudspringjsp.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.joao.librarycrudspringjsp.entities.Book;

public interface BookRepository extends JpaRepositoryImplementation<Book, Long> {

	public Book findByName(String name);

}
