package com.jsp.dao;


import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.jsp.dto.Employee;
import com.mysql.cj.Query;

public class EmployeeDao {
   public Employee saveEmployee(Employee e1) {
	   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
	   EntityManager entityManager = entityManagerFactory.createEntityManager();
	   EntityTransaction entityTransaction = entityManager.getTransaction();
	   
	   entityTransaction.begin();
	   entityManager.persist(e1);
	   entityTransaction.commit();
	   System.out.println("all done");
	return e1;
	   
   }
   public Employee getEmployee(int id) {
	   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
	   EntityManager entityManager = entityManagerFactory.createEntityManager();
	   EntityTransaction entityTransaction = entityManager.getTransaction();
	   
	  return entityManager.find(Employee.class,id);
	
   }
   
   public Employee deleteEmployee(Employee e) {
	   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
	   EntityManager entityManager = entityManagerFactory.createEntityManager();
	   EntityTransaction entityTransaction = entityManager.getTransaction();
	
	   Employee s1 =entityManager.find(Employee.class,e.getId());
	   entityTransaction.begin();
	   entityManager.remove(s1);
	   entityTransaction.commit();
	   System.out.println("all good");
    	return s1;
	   
   }
    
   public void getAll() {
	   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
	   EntityManager entityManager = entityManagerFactory.createEntityManager();
	   
	   String sql="Select e From Employee e";
	   
	  javax.persistence.Query query=entityManager.createQuery(sql);
	   
	   List<Employee> employees = query.getResultList();
	   
	   for (Employee employee : employees) {
		   System.out.println("===============");
		   System.out.println(employee.getId());
		   System.out.println(employee.getName());
		   System.out.println(employee.getEmail());
		
	}
  }
   
   public void updateEmployee() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction = entityManager.getTransaction();
	    
	    Employee s1 =entityManager.find(Employee.class,7);
	    
	    if (s1 !=null) {
			 s1.setName("omkar");
			 s1.setEmail("omkar@gmail.com");
			 entityTransaction.begin();
		     entityManager.merge(s1);
		     entityTransaction.commit();
		}else {
			System.out.println("Student not found");
		}
	      System.out.println("All good");
	}

	    
   }

