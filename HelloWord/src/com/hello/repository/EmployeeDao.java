package com.hello.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hello.pojo.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	JdbcTemplate dbTemplate;
	public Employee fetchEmployeeInfo(int EmployeeID) {
		List<Employee> employee = dbTemplate.query(
				"select EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,SALARY from EMPLOYEES WHERE EMPLOYEE_ID=?",
				new Object[] { EmployeeID }, new RowMapper<Employee>() {
					public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
						Employee emp = new Employee();
						emp.setEmployeeID(rs.getInt(1));
						emp.setEmployeeFirstName(rs.getString(2));
						emp.setEmployeeLastName(rs.getString(3));
						emp.setEmployeeEmailID(rs.getString(4));
						emp.setEmployeeSalary(rs.getInt(5));
						return emp;
					}
				});
		if (employee.isEmpty())
			return null;
		else
			return employee.get(0);
	}
}
