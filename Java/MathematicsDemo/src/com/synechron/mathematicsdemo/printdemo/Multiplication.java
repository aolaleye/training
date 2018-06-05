package com.synechron.mathematicsdemo.printdemo;

public class Multiplication {
	public int number1 = 5;
	public int number2 = 10;
	
	public Multiplication(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public Multiplication() {
		this.number1 = 12;
		this.number2 = 22;
	}

	public void MultiplyNumbers() {
		System.out.println("The product of " + number1 + " * " + number2 + " is: ");
		System.out.println(number1 * number2);
	}
}
