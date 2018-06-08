package com.synechron.keyworddemo.keyword;

public class Keyword {
	int empNumber;
	
	public Keyword() {
		System.out.println("This is a super class constructor");
	}
	
	public Keyword(int empNo) {
		this.empNumber = empNo;
	}
	
	public void display() {
		System.out.println(empNumber);
	}
}
