package com.synechron.mathematicsdemo.printdemo;

public class Addition {
	public int number1;
	public int number2;
	
	public Addition(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public Addition() {
		this.number1 = 12;
		this.number2 = 22;
	}

	public void AddNumbers() {
		System.out.println("The sum of " + number1 + " + " + number2 + " is: ");
		System.out.println(number1 + number2);
	}
}
