package com.synechron.variabledemo.variabletypedemo;

public class VariableClass {
//Type of variables: byte, short, int, long, float, double char, String
	
	private int empID;
	private String name;
	public VariableClass() {
		// TODO Auto-generated constructor stub
	}



	public int getEmpID() {
		return empID;
	}





	public void setEmpID(int empID) {
		this.empID = empID;
		System.out.println("The value for empID: " + empID + " The value of name: " + name);
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public void displayDataValue() {
		System.out.println("The value for number1: " + empID + " The value of name: " + name);
	}
	
}
