package com.pro.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pro.entity.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

		
}
