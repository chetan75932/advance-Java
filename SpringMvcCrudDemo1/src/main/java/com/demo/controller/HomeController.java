package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.User;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/login")
public class HomeController
{
	@Autowired
	ProductService ps;
	
	@GetMapping("/")
	public String LoginPage()
	{
		return "login";
	}
	
	@PostMapping("/validate")
	public ModelAndView validate(@RequestParam("uname") String unm,@RequestParam String passwd,HttpSession sess)
	{
		User u=ps.validateUser(unm,passwd);
		
		if(u!=null)
		{
			sess.setAttribute("user",u);
			return new ModelAndView("redirect:/Product/getProducts");
		}
		
		return new ModelAndView("wrongAttempt","msg","Something went wrong");
	}
	
	
	
}
