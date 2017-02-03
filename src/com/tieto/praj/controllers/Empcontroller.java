package com.tieto.praj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tieto.praj.bean.Emp;
import com.tieto.praj.dao.Empdao;

@Controller
/*@RequestMapping("/empform")*/
public class Empcontroller {
	 @Autowired  
	    Empdao dao;
	
	    @RequestMapping("/empform")  
	    public ModelAndView showform(){  
	        return new ModelAndView("empform","command",new Emp());  
	    }  
	    
	    @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute("emp") Emp emp){  
	        dao.save(emp); 
	        String message="Money added successfully..";
			return new ModelAndView("resultform","message",message);//will redirect to viewemp request mapping  
	    }  
}
