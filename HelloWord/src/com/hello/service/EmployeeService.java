package com.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.pojo.Employee;
import com.hello.repository.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	public Employee getEmployeeDetails(int EmployeeID) {
		Employee employee = employeeDao.fetchEmployeeInfo(EmployeeID);
		return employee;
	}
}
