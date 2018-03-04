package com.app.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController {
	@RequestMapping("/show")
        public ModelAndView showpage(){
        	Employee emp=new Employee();
        	emp.setEmpId(100);
        	emp.setEmpName("MAHI");
        	emp.setEmpSal(5000.0);
        	ModelAndView mav=new ModelAndView();
        	mav.setViewName("Home");
        	mav.addObject("emp",emp);
			return mav;
        	
        	
        }
}
