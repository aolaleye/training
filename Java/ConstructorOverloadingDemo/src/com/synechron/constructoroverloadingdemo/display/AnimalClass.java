package com.synechron.constructoroverloadingdemo.display;

public class AnimalClass {
	
	private String animalName;
	private int numberOfLegs;
	private String sound;
	
	public AnimalClass(String animalName,int numberOfLegs,String sound) {
		this.animalName = animalName;
		this.numberOfLegs = numberOfLegs;
		this.sound = sound;
	}
	
	public AnimalClass() {
		animalName = "Lion";
		numberOfLegs = 4;
		sound = "Roar!";
	}

	

	public void AnimalFacts() {
		System.out.println("Animal Name: " + animalName + " Number of Legs: " + numberOfLegs + " Sound: " + sound);
	}
}


