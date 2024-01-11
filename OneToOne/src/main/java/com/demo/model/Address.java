package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="AddHOTO")
public class Address
{
	
	
	@Id
	private int addId;
	
	private String city;
	private String State;
	public int getAddId() {
		return addId;
	}
	
	public Address() {
		super();
	}
	
	
	public Address(int addId, String city, String state) {
		super();
		this.addId = addId;
		this.city = city;
		State = state;
	}
	
	
	
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", State=" + State + "]";
	}
	
	
}
