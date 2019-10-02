package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table 
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int empId;
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
@Column
private String frstName;
@Column
private String lastName;
@Column
private String email;
@Column
private String ph;

@Column
@Temporal(TemporalType.DATE)

private Date dob;

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getFrstName() {
	return frstName;
}
public void setFrstName(String frstName) {
	this.frstName = frstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPh() {
	return ph;
}
public void setPh(String ph) {
	this.ph = ph;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", frstName=" + frstName + ", lastName=" + lastName + ", email=" + email
			+ ", ph=" + ph + ", dob=" + dob + "]";
}

}
