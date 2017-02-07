package com.tieto.praj.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.tieto.praj.bean.Emp;

public class Empdao {
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Emp p){  
	    String sql="insert into tcashuser(mobile_no,amount,comment1) values("+p.getMob_no()+","+p.getAmount()+","+p.getComment1()+")";  
	    return template.update(sql); 
	   
	    
	    
	}
	
}
