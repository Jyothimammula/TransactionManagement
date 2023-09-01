package com.ssd.transcation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.transcation.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
