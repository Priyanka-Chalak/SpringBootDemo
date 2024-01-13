package com.basic.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.employee.entity.Employee;
import com.basic.employee.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}
	
	@GetMapping("/find/{id}")
	public Employee findEmployeeById(@PathVariable Integer id)
	{
		return employeeService.findEmployeeById(id);
	}
	
	@GetMapping("/findAll")
	public List<Employee> findAllEmployee()
	{
		return employeeService.findAllEmployee();			
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployeeById(@PathVariable Integer id)
	{
		return employeeService.deleteEmployeeById(id);
	}
}
