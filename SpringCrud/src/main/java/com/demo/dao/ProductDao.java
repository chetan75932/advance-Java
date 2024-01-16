package com.demo.dao;

import java.util.List;

import com.demo.model.Product;
import com.demo.model.User;

public interface ProductDao {
	User validateUser(String unm, String passwd);

	List<Product> getAllProducts();

	void save(Product p);

	

	Product findById(int pid);

	void remove(int pid);

	void updateById(int pid, String pname);
}
