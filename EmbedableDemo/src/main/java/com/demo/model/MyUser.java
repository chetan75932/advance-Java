package com.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myUserH")
public class MyUser {
	  @Id
      private int uId;
      private String uName;
      @Embedded
      private Address addr;
	public MyUser() {
		super();
	}
	public MyUser(int uId, String uName, Address addr) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.addr = addr;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [uId=" + uId + ", uName=" + uName + ", addr=" + addr + "]";
	}
      
      
}
