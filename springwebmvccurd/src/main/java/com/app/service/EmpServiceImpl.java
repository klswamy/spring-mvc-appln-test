package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmpDao;
import com.app.model.Employee;
@Service
public class EmpServiceImpl implements EmpService {
String msg="";
	@Autowired
private EmpDao dao;
	@Override
	public String save(Employee emp) {
		int i=dao.save(emp);
		
		
		
		if(i>0) {
			msg="Record inserted";	
		}else {
			msg="Record not inserted";
		}
		
		return msg;
	}
	public List<Employee> getAll(){
		List<Employee> list=dao.getAll();
		return list;
	}
	@Override
	public void delete(int empId) {
		dao.delete(empId);
		
	}
	@Override
	public Employee update(int empId) {
		Employee emp=dao.update(empId);
		return emp;
	}
	@Override
	@Transactional
	public void updateEmp(Employee emp) {
		dao.updateEmp(emp);
		
	}

}
