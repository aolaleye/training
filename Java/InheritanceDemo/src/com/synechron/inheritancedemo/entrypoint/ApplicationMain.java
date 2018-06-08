package com.synechron.inheritancedemo.entrypoint;

import com.synechron.inheritancedemo.cars.AutomobileType;

public class ApplicationMain {
	
	public static void main(String[] args) {
		AutomobileType one = new AutomobileType();
		System.out.println(one.type);
		System.out.println(one.make);
		System.out.println(one.model);
		one.Drive();
	}

}
