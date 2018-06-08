package com.synechron.interfacedemo.vehicle;

public class Bicycle implements Vehicle {
	
	int speed;
	int gear;

	@Override
	public void changeGear(int newGear) {
	
		gear = newGear;
		
	}

	@Override
	public void increaseSpeed(int increment) {
	
		speed = (speed + increment);
		
	}

	@Override
	public void decreaseSpeed(int decrement) {
		
		speed = (speed - decrement);
		
	}
	
	public void printStats() {
		System.out.println("Gear: " + gear);
		System.out.println("Speed: " + speed);
	}

	
	
}
