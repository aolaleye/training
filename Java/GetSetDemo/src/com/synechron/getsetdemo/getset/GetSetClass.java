package com.synechron.getsetdemo.getset;

public class GetSetClass {
	
	private int idNumber;
	private String name;
	
	public GetSetClass() {
		
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		System.out.println("The value for idNumber: " + idNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("The value of name: " + name);
	}
	
	

}
