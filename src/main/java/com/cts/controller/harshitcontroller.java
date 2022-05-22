package com.cts.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.Harshit;


@Controller
public class harshitcontroller {

	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@RequestMapping("/view")
	public String view(Harshit harshit)
	{
		if(harshit.getAname().equals("Harshita") && harshit.getApass().equals("Harshita"))

		{
			return "view.jsp";
		}	
		return "error.jsp";
	}

}
