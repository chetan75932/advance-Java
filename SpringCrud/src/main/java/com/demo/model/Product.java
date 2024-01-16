package com.demo.model;

public class Product 
{
	


	private int prodId;
	
	private String desc;
	
	public Product() {
		super();
	}

	public Product(int prodId, String desc) {
		super();
		this.prodId = prodId;
		this.desc = desc;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", desc=" + desc + "]";
	}
	
	
	
}
