package com.pack.employee.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.pack.employee.model.Employee;

 @Component
public class EmployeeDao {
	
	@Autowired 
	private DataSource dataSource;
	 
	
	/*
	 * public void setDs(DataSource dataSource) { this.dataSource = dataSource; }
	 */
	
		 
		public int insert(Employee e) {
		 	
			JdbcTemplate insert = new JdbcTemplate(dataSource);
		int i=insert.update("insert into customer(name)  values(?)",e.getName());
			
			return i; 
		} 
		
		
		public List<Employee> viewAll()
		{
			JdbcTemplate insert = new JdbcTemplate(dataSource);
			String sql = "SELECT * from customer";
			
			List<Employee> employees  = insert.query(sql,new BeanPropertyRowMapper<Employee>(Employee.class));
			return employees;

       }
		
		
		public Employee getEmpById(int id){    
			JdbcTemplate obj = new JdbcTemplate(dataSource);
		    String sql="select * from customer where id=?";    
		    Employee emp= obj.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));  
		    return emp;
		  
		    
		} 
		
 }
