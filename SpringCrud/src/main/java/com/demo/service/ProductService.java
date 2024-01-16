package com.demo.service;

import java.util.List;

import com.demo.model.Product;
import com.demo.model.User;

public interface ProductService
{
	User validateUser(String unm, String passwd);

	List<Product> getProduct();

	void addnewProduct(Product p);

	

	Product getById(int pid);

	void getDltById(int pid);

	void updateProduct(int pid, String pname);

	
 

	
}
