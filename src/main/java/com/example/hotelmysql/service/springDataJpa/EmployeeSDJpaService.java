package com.example.hotelmysql.service.springDataJpa;

import com.example.hotelmysql.model.Employee;
import com.example.hotelmysql.repository.EmployeeRepository;
import com.example.hotelmysql.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeSDJpaService implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeSDJpaService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Set<Employee> findAll() {

        Set<Employee> employees =new HashSet<>();
        employeeRepository.findAll().forEach(employees::add);

        return employees;
    }

    @Override
    public Employee findById(Long aLong) {
        return employeeRepository.findById(aLong).orElse(null);
    }

    @Override
    public Employee save(Employee object) {
        return employeeRepository.save(object);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void deleteById(Long aLong) {
        employeeRepository.deleteById(aLong);
    }
}
