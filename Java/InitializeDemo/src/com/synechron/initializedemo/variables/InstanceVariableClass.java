package com.synechron.initializedemo.variables;

public class InstanceVariableClass {
	
	int i;
	static String name;
	
	public void Display() {
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) {
		InstanceVariableClass obj1 = new InstanceVariableClass();
		System.out.println("The value of name is: " + name);
		obj1.Display();
		String name2 = "Johnny";
		System.out.println(name2);
	}

}
