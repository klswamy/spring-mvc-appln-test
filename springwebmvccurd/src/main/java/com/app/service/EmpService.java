package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface EmpService {
	public String save(Employee emp);
	public List<Employee> getAll();
	public void delete(int empId) ;
	public Employee update(int empId); 
	public void updateEmp(Employee emp);
}
