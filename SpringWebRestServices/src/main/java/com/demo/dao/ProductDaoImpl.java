package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;
import com.demo.model.User;

@Repository
public class ProductDaoImpl implements ProductDao
{
	@Autowired
	private JdbcTemplate jdbtemp;
	public User validateUser(String unm, String passwd) {
		try {
			String selquery="select * from my_user where User_name=? and password=?";
			return jdbtemp.queryForObject(selquery, new Object[] {unm,passwd},BeanPropertyRowMapper.newInstance(User.class));
		}catch(EmptyResultDataAccessException e) {
			System.out.println("not found"+e.getMessage());
			return null;
		}
		
	}
	
	
	
	
	public List<Product> getAllProducts() {
	
		try {
			
			String sltQury="select * from product";
			return jdbtemp.query(sltQury, (rs,num)->{
				Product p=new Product();
				p.setProdId(rs.getInt(1));
				p.setDesc(rs.getString(2));
				
				return p;
			});
			
		}catch(EmptyResultDataAccessException e){
			System.out.println("not found"+e.getMessage());
			return null;
		}
	}




	@Override
	public void save(Product p) {
		String str="insert into product values(?,?)";
		jdbtemp.update(str,new Object[] {p.getProdId(),
				p.getDesc()});
		
	}




	



//	@Override
//	public Product findById(int pid) {
//		try {
//			String selquery="select * from product where PRODID=?";
//			return jdbtemp.queryForObject(selquery,new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
//		}catch(EmptyResultDataAccessException e) {
//			System.out.println("not found"+e.getMessage());
//			return null;
//		}
//		
//	}



	@Override
	public Product findById(int pid) {
		try {
		    return jdbtemp.queryForObject("select * from product where PRODID=?",new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
		
	}

	
	
	@Override
	public void remove(int pid) {
		try {
			String delquery="delete from product where PRODID=?";
			jdbtemp.update(delquery,new Object[] {pid});
		
		}catch(EmptyResultDataAccessException e) {
			System.out.println("not found"+e.getMessage());
		}
	}
	
	public void updateById(Product p) {
		try {
			String updquery="update product set DESCRIP=? where PRODID=?";
			jdbtemp.update(updquery,new Object[] {p.getDesc(),p.getProdId()});
		
		}catch(EmptyResultDataAccessException e) {
			System.out.println("not found"+e.getMessage());
		}
	}
		
	
}
