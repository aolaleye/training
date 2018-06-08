package com.synechron.methodoverloadingdemo.method;

public class Method {
	int num1;
	int num2;
	int num3;
	
	void printString(String a) {
		System.out.println("The String is: " + a);
	}
	
	void addNumbers(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		System.out.println("The sum of the numbers is: " + (this.num1 + this.num2 + this.num3));
	}

	public static void main(String[] args) {
		Method string1 = new Method();
		string1.printString("Texas");
		
		Method sum2 = new Method();
		sum2.addNumbers(3, 5, 9);
		
		Method sum3 = new Method();
		sum3.addNumbers(6, 2, 10);
	}

}
