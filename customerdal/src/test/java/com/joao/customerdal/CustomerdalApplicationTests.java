package com.joao.customerdal;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.joao.customerdal.entities.Customer;
import com.joao.customerdal.repos.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository repo;

	@Test
	void saveCustomer() {
		Customer c = new Customer();
		c.setName("Aboba");
		c.setEmail("aboba@test.com");
		this.repo.save(c);
	}

	@Test
	void findCustomerById() {
		Customer c = this.repo.findById(1l).orElse(null);
		assertThat(c).isNotNull();
	}

	@Test
	void updateCustomer() {
		Customer c = this.repo.findById(1l).orElse(null);
		c.setEmail("abobapera@email.com");
		this.repo.save(c);
	}
	
	@Test
	void deleteCustomer() {
		Customer c = this.repo.findById(4l).orElse(null);
		this.repo.delete(c);
	}

}
