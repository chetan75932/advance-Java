package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.model.User;
import com.demo.service.ProductService;


@Controller
@RequestMapping("/Product")
public class ProductController 
{
	
	@Autowired
	private ProductService pds;
	
	
	@GetMapping("/getProducts")
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
	
	@GetMapping("/addproduct")
	public String addproduct() {
		return "addproduct";
	}
	
	@PostMapping("/insertProduct")
	public ModelAndView insertProduct(@RequestParam int pid,@RequestParam String pname) {
		Product p=new Product(pid,pname);
		pds.addnewProduct(p);
		return new ModelAndView("redirect:/Product/getProducts");
	}
	
	@GetMapping("/edit/{pid}")
	public ModelAndView editproduct(@PathVariable("pid") int pid) {
		System.out.println(pid);
		Product p=pds.getById(pid);
		System.out.println(p);
		return new ModelAndView("editproduct","p",p);
	}
	
	@GetMapping("/delete/{pid}")
	public ModelAndView dltProduct(@PathVariable("pid") int pid)
	{
		pds.getDltById(pid);
		
		return new ModelAndView("redirect:/Product/getProducts");
	}
	
	@PostMapping("/editProduct")
	public ModelAndView editProduct(@RequestParam int pid,@RequestParam String pname)
	{
		pds.updateProduct(pid,pname);
		
		return new ModelAndView("redirect:/Product/getProducts");
	}
}
