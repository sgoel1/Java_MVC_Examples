package com.controller;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Empl;
import com.pojo.User;



@Controller
public class MyController {
 
	@RequestMapping("/hello")
	public String display(Model m){
		m.addAttribute("user",new User());
		return "index";
	}
	@RequestMapping("/world")
	public String display1(@Valid User user,BindingResult result){
		if(result.hasErrors())
			return "index";
		else
			return "hello";
	}

}
