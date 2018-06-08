package com.synechron.interfacedemo.vehicle;

public class ApplicationMain {

	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle();
		bike1.changeGear(2);
		bike1.increaseSpeed(5);
		bike1.printStats();
		
		bike1.changeGear(3);
		bike1.decreaseSpeed(3);
		bike1.printStats();
		
		Motorcycle motor1 = new Motorcycle();
		motor1.changeGear(2);
		motor1.increaseSpeed(5);
		motor1.printStats();
	}
	
}
