package com.example.hotelmysql.service.springDataJpa;

import com.example.hotelmysql.model.Customer;
import com.example.hotelmysql.repository.CustomerRepository;
import com.example.hotelmysql.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomerSDJpaService implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerSDJpaService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Set<Customer> findAll() {

        Set<Customer> customers = new HashSet<>();
        customerRepository.findAll().forEach(customers::add);

        return customers;
    }

    @Override
    public Customer findById(Long aLong) {
        return customerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Customer save(Customer object) {
        return customerRepository.save(object);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void deleteById(Long aLong) {
        customerRepository.deleteById(aLong);
    }
}
