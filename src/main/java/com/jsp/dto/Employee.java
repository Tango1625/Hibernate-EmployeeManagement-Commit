package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id ;
   private String name;
   private String email;
   private int balance;
   private int totalpaid;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public int getTotalpaid() {
	return totalpaid;
}
public void setTotalpaid(int totalpaid) {
	this.totalpaid = totalpaid;
}
   
   
   
   
}
