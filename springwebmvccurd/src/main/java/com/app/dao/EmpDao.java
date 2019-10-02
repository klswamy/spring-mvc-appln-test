package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface EmpDao {

    int save(Employee emp);
	public List<Employee> getAll();
	public void delete(int empId); 
	public Employee update(int empId);
	public void updateEmp(Employee emp);

}
