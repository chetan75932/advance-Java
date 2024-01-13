package com.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    
	private int addId;
    private String city;
    private String state;
    
    public Address() {
		super();
	}

	public Address(int addId, String city, String state) {
		super();
		this.addId = addId;
		this.city = city;
		this.state = state;
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
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [addId=").append(addId).append(", city=")
				.append(city).append(", state=").append(state).append("]");
		return builder.toString();
	}
    
    
}
