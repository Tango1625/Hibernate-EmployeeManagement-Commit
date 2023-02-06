package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Employee e1 =new Employee();
//     e1.setId(9);
//     e1.setName("nishant");
//     e1.setEmail("nihant@gmail.com");
//     e1.setBalance(20000);
//     e1.setTotalpaid(10000);
//     
//     EmployeeService employeeService=new EmployeeService();
//     employeeService.saveEmployee(e1);
//      
//     delete employee
//     Employee e = new Employee();
//     e.setId(1);
//     employeeService.deleteEmployee(e);
//     
     
//     getall object
//     Employee up = new Employee();
////     up.setName("adved");
//     employeeService.getAll();
//     
//	Employee em = new 	Employee();
//	em.setId(8);
//	EmployeeService es = new EmployeeService();
//	es.deleteEmployee(em);
//	
     Employee s1 = new Employee();
     s1.setName("tango");
     EmployeeService es = new EmployeeService();
     es.updateEmployee();
     
	}

}
