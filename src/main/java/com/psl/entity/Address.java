package com.psl.entity;

public class Address {

	 private String city;
	 private String street;
	 private String zip;
	 public Address(){ System.out.println("in default constructor in address"); }
	public Address(String city, String street, String zip) {
		
		this.city = city;
		this.street = street;
		this.zip = zip;
		System.out.println("in parameterised constructor in address");
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
		System.out.println("in set city");
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
		System.out.println("in set street");
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
		System.out.println("in set zip");
	}
	
	 
}
