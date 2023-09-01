package com.ssd.transcation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssd.transcation.dto.EmployeeDto;
import com.ssd.transcation.model.Department;
import com.ssd.transcation.model.Employee;
import com.ssd.transcation.repository.DepartmentRepository;
import com.ssd.transcation.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository erepo;
	
	@Autowired
	public DepartmentRepository drepo;
	
	public String saveEmployee(EmployeeDto dto) {
		Employee e=new Employee();
		e.setEname(dto.getEname());
		e.setEmail(dto.getEmail());
		Employee emp=erepo.save(e);
	   Department d=null;
	   d.setDname(dto.getDname());
	   d.setDcode(dto.getDcode());
	   d.setEmployee(emp);
	   Department dept= drepo.save(d);
	   
	   return "employee saves successfully:"+emp.getEid();
	   
	}

}
