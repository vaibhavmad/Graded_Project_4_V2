package com.gl.com.service;

import com.gl.com.model.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(Long id);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    List<Employee> getEmployeesByFirstName(String firstName);
    List<Employee> sortEmployees(String order);
}