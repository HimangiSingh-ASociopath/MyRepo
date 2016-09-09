package com.psl.entity;

public class Employee {
	
	private int id;
	private String name;
	private Address addr;
	
	public Employee(){System.out.println("in default constructor of emp");}
	

	public Employee(int id, String name, Address addr) {
	
		this.id = id;
		this.name = name;
		this.addr = addr;
		System.out.println("in parameterised constructor of emp ");
	}
	
	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
		System.out.println("in set city");
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		System.out.println("in set name");
	}


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
		System.out.println("in set address");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
