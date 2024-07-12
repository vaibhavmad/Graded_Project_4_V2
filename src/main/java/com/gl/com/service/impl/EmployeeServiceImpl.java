package com.gl.com.service.impl;

import com.gl.com.model.Employee;
import com.gl.com.repository.EmployeeRepository;
import com.gl.com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getEmployeesByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }

    @Override
    public List<Employee> sortEmployees(String order) {
        if ("asc".equalsIgnoreCase(order)) {
            return employeeRepository.findAllByOrderByFirstNameAsc();
        } else if ("desc".equalsIgnoreCase(order)) {
            return employeeRepository.findAllByOrderByFirstNameDesc();
        } else {
            throw new IllegalArgumentException("Invalid sort order");
        }
    }
    
}