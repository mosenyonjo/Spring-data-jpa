package com.ms.springdatajpa.repository;

import com.ms.springdatajpa.modal.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findEmployeesByLastNameContaining(String str);
}
