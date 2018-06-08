package com.synechron.superdemo.parent;

public class Child extends Parent {
	int i = 20;
	
	void display() {
		System.out.println("Value of i from child is: " + i);
		System.out.println("Value of i from parent is: " + super.i);
		
	}
}
