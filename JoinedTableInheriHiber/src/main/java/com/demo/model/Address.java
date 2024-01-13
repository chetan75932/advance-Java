package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="AddHOTOBD")
public class Address
{
	
	
	@Id
	private int addId;
	
	private String city;
	private String State;
	@OneToOne(mappedBy="addr")
	private MyUser u1;
	
	
	public Address() {
		super();
	}
	
	
	

	public Address(int addId, String city, String state, MyUser u1) {
		super();
		this.addId = addId;
		this.city = city;
		State = state;
		this.u1 = u1;
	}


	public int getAddId() {
		return addId;
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


	public MyUser getU1() {
		return u1;
	}


	public void setU1(MyUser u1) {
		this.u1 = u1;
	}

	
	
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", State=" + State + "]";
	}

	
	
}
