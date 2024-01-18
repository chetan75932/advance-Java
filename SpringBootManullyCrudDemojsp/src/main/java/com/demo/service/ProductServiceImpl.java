package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDaoInterface;
import com.demo.model.Product;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDaoInterface pd;
//
//	public User validateUser(String unm, String passwd) {
//		return pd.validateUser(unm,passwd);
//	}

	public List<Product> getProduct() {
		return pd.findAll();
	}

	@Override
	public void addnewProduct(Product p) {
		 pd.save(p);
		
	}

	

	@Override
	public Product getById(int pid) {
		
		Optional<Product> op=pd.findById(pid);
		if(op.isPresent())
		{
			return op.get();
		}
		return null;
	}

	@Override
	public void getDltById(int pid) {
		
		 pd.deleteById(pid);
		
	}

	@Override
	public void updateProduct(Product p) {
		Optional<Product> op=pd.findById(p.getProdId());
		
		if(op.isPresent())
		{
			Product new_p=op.get();
			new_p.setDesc(p.getDesc());
			pd.save(new_p);
		}
		
	}
	

}
