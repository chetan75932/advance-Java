package com.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Embeddable
public class Address {
	    
        private int addrId;
        private String city;
        private String State;
		public Address() {
			super();
		}
		public Address(int addrId, String city, String state) {
			super();
			this.addrId = addrId;
			this.city = city;
			State = state;
		}
		public int getAddrId() {
			return addrId;
		}
		public void setAddrId(int addrId) {
			this.addrId = addrId;
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
			return "Address [addrId=" + addrId + ", city=" + city + ", State=" + State + "]";
		}
       
        
        
}
