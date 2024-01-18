package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	private ProductService ps;
	

	@GetMapping("/products")
	public ModelAndView getAllProducts()
	{
		List<Product> plist=ps.getProduct();
		
		
		return new ModelAndView("Display","plist",plist);
	}
	
	
	@GetMapping("/addproduct")
	public String addProductPage()
	{
		return "addproduct";
	}
	
	
	@PostMapping("/insertProduct")
	public ModelAndView insertProduct(@RequestParam int pid,@RequestParam String pname)
	{
		Product p=new Product(pid,pname);
		
		ps.addnewProduct(p);
		
		return new ModelAndView("redirect:/product/products");
	}
	
//	@GetMapping("/edit/{id}")
//	public ModelAndView editPage(@PathVariable int id)
//	{
//		Product p=ps.getById(id);
//		
//		return new ModelAndView("editproduct","p",p);
//	}
//	
//	@PostMapping("/editProduct")
//	public ModelAndView editedproduct(@RequestParam int pid,@RequestParam String pname)
//	{
//		System.out.println("yes");
//		return new ModelAndView("redirect:/product/products");
//	}
//	
	
	
	@GetMapping("/edit/{id}")
	public ModelAndView editProduct(@PathVariable("id") int pid) {
		Product p=ps.getById(pid);
		return new ModelAndView("editproduct","p",p);
		
	}
	
	@PostMapping("/editProduct")
	public ModelAndView updateProdut(@RequestParam int pid, @RequestParam String pname) {
		ps.updateProduct(new Product(pid,pname));
		return new ModelAndView("redirect:/product/products");
	}
	@GetMapping("delete/{id}")
	public ModelAndView deleteProduct(@PathVariable("id") int pid) {
		ps.getDltById(pid);
		return new ModelAndView("redirect:/product/products");
		
	}
	
}
