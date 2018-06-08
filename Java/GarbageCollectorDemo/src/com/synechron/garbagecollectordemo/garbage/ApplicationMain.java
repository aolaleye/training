package com.synechron.garbagecollectordemo.garbage;

public class ApplicationMain {

	public static void main(String[] args) {
		GarbageDemo gd = new GarbageDemo();
		GarbageDemo gd2 = new GarbageDemo();
		gd = null;
		gd2 = null;
	}
	
	public void finalize() {
		System.out.println("Garbage Collected");
	}
}
