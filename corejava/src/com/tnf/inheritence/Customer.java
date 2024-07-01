// program to demonstrate single inheritence.
package com.tnf.inheritence;

public class Customer {
	private String name;
	private int id;
	private long aadharno;
	private long phone;
	
	//default constructor
	public Customer() {
		super();
	}

	public Customer(String name, int id, long aadharno, long phone) {
		super();
		this.name = name;
		this.id = id;
		this.aadharno = aadharno;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", aadharno=" + aadharno + ", phone=" + phone + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	

	
	}

