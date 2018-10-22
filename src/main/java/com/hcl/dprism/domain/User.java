package com.hcl.dprism.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="SX_USER_MASTER")
@NamedQuery(name="findAllUsers",query="select um from User um")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="USER_ID")
private Long userId;

@Column(name="FULL_NAME")
private String fullName;

@Column(name="EMAIL_ADDRESS")
private String emailAddress;

@Column(name="EMPLOYEE_NUMBER")
private String employeeNumber;

public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getEmailAddress() {
	return emailAddress;
}

public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}

public String getEmployeeNumber() {
	return employeeNumber;
}

public void setEmployeeNumber(String employeeNumber) {
	this.employeeNumber = employeeNumber;
}
}
