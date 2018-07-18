package com.exapmle.demo.service;


import com.exapmle.demo.model.Employee;
import com.exapmle.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpoyeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> seacrh(String q) {
        return employeeRepository.findByNameContaining(q);
    }

    @Override
    public Optional<Employee> findOne(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee contact) {
    employeeRepository.save(contact);
    }

    @Override
    public void delete(int id) {
    employeeRepository.deleteById(id);
    }
}
