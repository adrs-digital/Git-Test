package com.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.entity.Employee;
import com.pro.repo.EmployeeDAO;
@Service("service")
public class EmpServiceImpl implements EmpService {
	@Autowired
	public EmployeeDAO eDao;

	@Override
	public int count() {
		int numOfEmp;
		numOfEmp=(int) eDao.count();
		return numOfEmp;
	}

	@Override
	public List<Employee> getAllEmps() {
		List<Employee> list=null;
	//use DAO obj	
		list=(List<Employee>) eDao.findAll();
		return list;
	}
	
	

}
