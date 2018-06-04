package com.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{	
	

}
