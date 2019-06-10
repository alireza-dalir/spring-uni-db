package com.example.hotelmysql.repository;

import com.example.hotelmysql.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
