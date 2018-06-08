package com.synechron.constructoroverloadingdemo.entrypoint;

import com.synechron.constructoroverloadingdemo.display.AnimalClass;

public class ApplicationMain {
	
	public static void main(String[] args) {
		
		AnimalClass lion = new AnimalClass();
		AnimalClass dog = new AnimalClass("Dog", 4, "Bark!");
		
		lion.AnimalFacts();
		dog.AnimalFacts();
	}

}
