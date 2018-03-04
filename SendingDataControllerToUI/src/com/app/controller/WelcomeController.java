package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
public class WelcomeController {
      @RequestMapping("/show")
	 public ModelAndView showpage(){
    	  Employee emp=new Employee();
    	  emp.setEmpId(100);
    	  emp.setEmpName("Mahi");
    	  emp.setEmpSal(5000.0);
    	  Employee emp1=new Employee();
    	  emp1.setEmpId(100);
    	  emp1.setEmpName("Mahi");
    	  emp1.setEmpSal(5000.0);
    	  Employee emp2=new Employee();
    	  emp2.setEmpId(100);
    	  emp2.setEmpName("Mahi");
    	  emp2.setEmpSal(5000.0);
    	  
    	  List<Employee> empList=new ArrayList<Employee>();
    	  empList.add(emp);
    	  empList.add(emp1);
    	  empList.add(emp2);
    	  ModelAndView mav=new ModelAndView();
    	/*  int empId=10;
    	  String empName="Mahi";
    	  double empSal=5000.0;
    	  ModelAndView mav=new ModelAndView();
    	  mav.setViewName("Home");
    	  mav.addObject("id",empId);
    	  mav.addObject("name",empName);
    	  mav.addObject("sal",empSal);*/
    	  mav.setViewName("Home");
    	  mav.addObject("empList",empList);
		return mav;
	 }
}
