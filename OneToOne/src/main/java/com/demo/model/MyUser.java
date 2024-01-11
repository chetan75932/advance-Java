package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MyUserHOTO")
public class MyUser
{
	@Id
	private int uId;
	
	private String uName;
	private String uJob;
	@OneToOne
	@JoinColumn(name="addrId")
	private Address addr;
	public MyUser() {
		super();
	}
	public MyUser(int uId, String uName, String uJob, Address addr) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uJob = uJob;
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
	public String getuJob() {
		return uJob;
	}
	public void setuJob(String uJob) {
		this.uJob = uJob;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [uId=" + uId + ", uName=" + uName + ", uJob=" + uJob + ", addr=" + addr + "]";
	}
	
	
	
	
}