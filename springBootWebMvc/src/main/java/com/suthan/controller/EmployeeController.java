package com.suthan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suthan.model.Employee;

@Controller
public class EmployeeController {

	
	@RequestMapping("/data")
	//@ResponseBody
	public String show(Model model)
	{
		Employee emp = new Employee();
		
		emp.setEid(1000);
		emp.setEname("JAVA");
		emp.setEaddr("SL");
		
		model.addAttribute("employee",emp);
		model.addAttribute("eid",100);
		model.addAttribute("ename","suthan");
		model.addAttribute("eaddr","Kandy");
		return "EmpWish";
		
	}
	
	@RequestMapping("/DATA")
	public String Data()
	{
		return "EmpData";
		
	}
}
