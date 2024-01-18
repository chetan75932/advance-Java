package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductSB")
public class Product 
{
	

	@Id
	private int prodId;
	
	private String descc;
	
	public Product() {
		super();
	}

	public Product(int prodId, String desc) {
		super();
		this.prodId = prodId;
		this.descc = desc;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getDesc() {
		return descc;
	}

	public void setDesc(String desc) {
		this.descc = desc;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", desc=" + descc + "]";
	}
	
	
	
}
