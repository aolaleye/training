package com.synechron.staticmethoddemo.department;

public class Department {
	int deptNo;
	static String city = "Fort Lauderdale";
	
	static void updateCity() {
		city = "Texas";
	}
	
	void DisplayInfo() {
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		updateCity();
		Department dept1 = new Department();
		dept1.DisplayInfo();
	}
}
