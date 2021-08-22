package com.joao.customerdal.repos;

import org.springframework.data.repository.CrudRepository;

import com.joao.customerdal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
