package com.autozone.aaf;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}
