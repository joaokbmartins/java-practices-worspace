package com.joao.bookdal.repos;

import org.springframework.data.repository.CrudRepository;

import com.joao.bookdal.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
