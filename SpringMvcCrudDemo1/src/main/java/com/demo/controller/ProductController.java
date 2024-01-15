package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.model.User;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController 
{
	
	@Autowired
	private ProductService pds;
	
	
	@GetMapping("/getproduct")
	public ModelAndView getAllProduct(HttpSession ss)
	{
		User u =(User) ss.getAttribute("user");
		
		if(u!=null)
		{
			List<Product> plist=pds.getProduct();
			
			return new ModelAndView("Display","plist",plist);
		}
		
		return new ModelAndView("redirect:/login");
	}
	
}
