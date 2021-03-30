package com.hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hello.pojo.Employee;
import com.hello.service.EmployeeService;

@Controller
@SessionAttributes({"employee","employeeList"})
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/welcome", method = { RequestMethod.GET })
	public String getHomePage() {

		return "home";
	}

	@RequestMapping(value = "/employee/{employeeID}", method = { RequestMethod.GET })
	public String getEmployeeData(Model model, @PathVariable("employeeID") int employeeID) {
		Employee emp = employeeService.getEmployeeDetails(employeeID);
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(emp);
		System.out.println(employeeList.get(0).getEmployeeEmailID());
		model.addAttribute("employee", employeeList);
		model.addAttribute("name", emp.getEmployeeFirstName());
		return "employeeHome";
	}

}
