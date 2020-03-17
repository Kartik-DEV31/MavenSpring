package com.MavenSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	
	
	
	@RequestMapping("/Sample")
	public String display()
	{
		
		
		return "Sample";
		
	}

}
