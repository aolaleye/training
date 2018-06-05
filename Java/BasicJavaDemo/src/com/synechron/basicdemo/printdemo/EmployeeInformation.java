package com.synechron.basicdemo.printdemo;

public class EmployeeInformation {
	public int age;
	public String name;

	public EmployeeInformation(int ageOfEmployee, String nameOfEmployee) {
		this.age = ageOfEmployee;
		this.name = nameOfEmployee;
	}

	public void DisplayInformation() {
		System.out.println("This is Display Information method Age: " + age + " Name of employee: " + name);
	}
}
