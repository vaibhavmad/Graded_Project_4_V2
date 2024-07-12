package com.gl.com.repository;

import com.gl.com.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByFirstName(String firstName);
    List<Employee> findAllByOrderByFirstNameAsc();
    List<Employee> findAllByOrderByFirstNameDesc();
}