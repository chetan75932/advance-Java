package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class HelloController {
	//@RequestMapping(value="/hello",method=RequestMethod.POST)
	//@RequestMapping("/hello")
	@GetMapping("/hello")
	public ModelAndView sayHello() {
		System.out.println("sayHello called");
		String s="Say Hello From Controller";
		return new ModelAndView("myhello","msg",s);
	}
}
