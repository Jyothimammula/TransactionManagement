package com.ssd.transcation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.transcation.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
