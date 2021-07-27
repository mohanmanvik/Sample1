package com.pack.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pack.employee.dao.EmployeeDao;
import com.pack.employee.model.Employee;

@Controller
public class EmployeeController {
	 @Autowired    
	    EmployeeDao employeeDao;
		
	
	@RequestMapping("/addUserForm")  
 public String add(Model m)  
 {  
     m.addAttribute("emp", new  Employee());  
     return "userForm";  
 }
	
	
	  @RequestMapping(value = "/addEmployee", method = RequestMethod.POST) 
	  public String addStudent(Employee employee) {
		 int res= employeeDao.insert(employee);
		 if (res>=1)
		  return "redirect:/viewForm";
		 else
			 return "adduser-error";
	   
	  }
	 
	
	  @RequestMapping("/viewForm")    
	    public String viewemp(Model m){    
	        List<Employee> list=employeeDao.viewAll();  
	        m.addAttribute("list",list);  
	        return "view";    
	    }  
	  
	  
		
}