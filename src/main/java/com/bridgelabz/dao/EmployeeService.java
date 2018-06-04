package com.bridgelabz.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.model.Employee;
import com.bridgelabz.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	
	/* save employee */
	
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
		
	}
	/* serch all  employee */
	
	public List <Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	
	/* get  employee by id */
	public Employee findOne(Long empId) {
		return employeeRepository.getOne(empId);
	}
	
	/* delete employee  */
	
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
		
	}
	
}
