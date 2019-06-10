package com.example.hotelmysql.repository;

import com.example.hotelmysql.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
