package com.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Customer")
public class Customer extends Person {
      private String emailId;
      private double fees;
	public Customer() {
		super();
	}
	public Customer(int pId, String pName,String emailId, double fees) {
		super(pId,pName);
		this.emailId = emailId;
		this.fees = fees;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [emailId=").append(emailId).append(", fees=").append(fees).append("]");
		return builder.toString();
	}
      
      
	
}
