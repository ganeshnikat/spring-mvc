package com.hello.pojo;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	int EmployeeID;
	String EmployeeFirstName;
	String EmployeeLastName;
	String EmployeeEmailID;
	int EmployeeSalary;
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeFirstName() {
		return EmployeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		EmployeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return EmployeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		EmployeeLastName = employeeLastName;
	}
	public String getEmployeeEmailID() {
		return EmployeeEmailID;
	}
	public void setEmployeeEmailID(String employeeEmailID) {
		EmployeeEmailID = employeeEmailID;
	}
	public int getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	
}
