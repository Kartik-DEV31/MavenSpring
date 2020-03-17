package com.MavenSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class controller1 {
	
	@RequestMapping(value = "/checkaccount", method = RequestMethod.GET)
	public String display(
			
			@RequestParam("name")
			String username,
			@RequestParam("pass")
			String password,
			Model m
			
			) {
		
		
		
		if(username.equals("kartik"))
		{
			String msg="Hello"+username;
			
			m.addAttribute("message",msg);
		return "success";
		}
		else 
		{
			String msg="Wrong Details";
			m.addAttribute("message",msg);
			return"error";
		}
			
	}
	
}