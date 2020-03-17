package com.pro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pro.entity.Employee;

public interface EmpService {
	
	public int count();
	public List<Employee> getAllEmps();

}
