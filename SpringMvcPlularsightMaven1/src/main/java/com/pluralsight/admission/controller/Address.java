package com.pluralsight.admission.controller;

public class Address {

	private String country;
	private String city;
	private int pincode;
	
	
	
	public Address(String country, String city, int pincode) {
		super();
		this.country = country;
		this.city = city;
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}
