package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;
import com.app.service.IEmployeeService;

@Controller
public class IEmployeeController {
	
	   @Autowired
        private IEmployeeService empService;
	    @RequestMapping("/reg")
	    public ModelAndView showpage(HttpServletRequest req,HttpServletResponse res){
			return new ModelAndView("Registration");
	    	
	    }
	    @RequestMapping(value="/insert",method=RequestMethod.POST)
	    public ModelAndView insertData(@ModelAttribute("employee")Employee emp){
	    	int id=empService.insertEmployee(emp);
	    	ModelAndView mav=new ModelAndView();
	    	mav.setViewName("Message");
	    	mav.addObject("msg","success");
			return mav;
	    	
	    }
	    @RequestMapping("showAllRecords")
	    public ModelAndView getAllRecords(){
	    	List<Employee> empList=empService.getAllEmployeeRecords();
	    	ModelAndView mav=new ModelAndView("showRecords");
	    	mav.addObject("empList",empList);
			return mav;
	    	
	    }
	    @RequestMapping(value="/delete/{id}")
		public String deleteRecord(@PathVariable("id")int empId){
			int i=empService.deleteEmployee(empId);
			return "redirect:../showAllRecords";
		}
        
}
