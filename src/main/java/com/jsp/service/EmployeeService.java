package com.jsp.service;


import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {
	
	EmployeeDao ed = new EmployeeDao();
     public Employee saveEmployee(Employee e) {
    	return ed.saveEmployee(e);
    	 
   }
     public Employee deleteEmployee(Employee e) {
    	 return ed.deleteEmployee(e);
     }
     
     public void getAll()  {
		 ed.getAll();    	 
     }
     
     public void updateEmployee() {
    	 ed.updateEmployee();
     }
}
