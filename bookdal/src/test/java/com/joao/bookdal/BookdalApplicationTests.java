package com.joao.bookdal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.joao.bookdal.entities.Book;
import com.joao.bookdal.repos.BookRepository;

@SpringBootTest
class BookdalApplicationTests {

	@Autowired
	private BookRepository repo;

	@Test
	void contextLoads() {
		Book b1 = new Book();
		b1.setName("Dom Casmurro");
		b1.setPrice(99d);
		repo.save(b1);
	}

	@Test
	void findBookById() {
		repo.findById(1l);
	}

	@Test
	void updateBook() {
		Book b1 = repo.findById(1l).get();
		b1.setPrice(999d);
		repo.save(b1);
	}

	@Test
	void deleteBook() {
		Book b3 = repo.findById(3l).get();
		repo.delete(b3);
	}

}
