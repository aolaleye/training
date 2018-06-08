package com.synechron.vehicledemo.vehicle;

public class Car extends Ground {
	
	void efficiency() {
		System.out.println("Efficiency: 56%");
	}

	@Override
	void speed() {
		System.out.println("Speed: 56mph");
		
	}

	@Override
	void modeOfTransport() {
		System.out.println("Mode of Transport: Motorcycle");
		
	}
	
}
