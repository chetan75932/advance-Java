package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;
import com.demo.model.User;

@Service
public class ProductServiceImpl implements ProductService 
{
	@Autowired
	ProductDao pd;
	


	public User validateUser(String unm, String passwd) {
		
		return pd.validateUser(unm,passwd);
	}



	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return pd.getAllProducts();
	}
}
