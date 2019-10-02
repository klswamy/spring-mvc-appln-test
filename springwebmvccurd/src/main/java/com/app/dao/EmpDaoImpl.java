package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Employee;

@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private HibernateTemplate temp;
@Transactional
	public int save(Employee emp) {
		int i=(int)temp.save(emp);
		return i;
	}

public List<Employee> getAll(){
	List<Employee> list=temp.loadAll(Employee.class);
	return list;
}
@Transactional
public void delete(int empId) {
	Employee emp=temp.get(Employee.class, empId);
	temp.delete(emp);
}

@Override
public Employee update(int empId) {
	Employee emp=temp.get(Employee.class, empId);
	return emp;
	
}

@Override
public void updateEmp(Employee emp) {
	temp.saveOrUpdate(emp);
	
}

}
