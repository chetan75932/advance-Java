package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public interface ProductDaoInterface extends JpaRepository<Product,Integer>
{
	
}
