package com.synechron.comparablecomparator;

public class LaptopDemo implements Comparable<Laptop> {

	private String brand;
	private int price;
	private int ram;
	
	public LaptopDemo(String brand, int price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	
	@Override
	public int compareTo(Laptop laps2) {
		if (this.getRam() > laps2.getRam()) {
			return 1;
		} else {
			return -1;
		}
		
	}


}

