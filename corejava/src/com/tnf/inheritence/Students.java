package com.tnf.inheritence;

public class Students extends Customer {

	private String collegeName;
	private int rollno;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String name, int id, long aadharno, long phone,String collegeName,int rollno) {
		super(name, id, aadharno, phone);
		this.collegeName = collegeName;
		this.rollno = rollno;
		
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Students [collegeName=" + collegeName + ", rollno=" + rollno + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getAadharno()=" + getAadharno() + ", getPhone()=" + getPhone() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
	

}
