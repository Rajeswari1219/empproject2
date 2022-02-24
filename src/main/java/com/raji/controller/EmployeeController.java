package com.raji.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.raji.dao.EmployeeRepo;
import com.raji.entity.Employee;

@Controller
	public class EmployeeController {
		
		@Autowired
		EmployeeRepo er;
		
		@RequestMapping("/")
		public String show()
		{
			return "index.jsp";
		}
		
		@RequestMapping("/addemployee")
		@ResponseBody
		public String addemployee(Employee e)
		{
			er.save(e);
			return "employee added...";
		}
		
		@RequestMapping("/viewemployee")
		@ResponseBody
		public String viewvideo(int id)
		{
			Employee e = er.findById(id).orElse(new Employee());
			return e.toString();
		}
		
		@RequestMapping("/viewallemployees")
		@ResponseBody
		public String viewallemployees()
		{
			List<Employee> el =(List<Employee>) er.findAll();
			return el.toString();
		}
		
		@RequestMapping("/updateemployee")
		@ResponseBody
		public String updateemployee(Employee e)
		{
			er.save(e);
			return "employee updated...";
		}
		
		@RequestMapping("/deleteemployee")
		@ResponseBody
		public String deleteemployee(int id)
		{
			er.deleteById(id);
			return "employee deleted...";
		}
	}

