package com.exapmle.demo.service;


import com.exapmle.demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Iterable<Employee> findAll();
    List<Employee> seacrh(String q);
    Optional<Employee> findOne(int id);
    void save(Employee contact);
    void delete(int id);
}
