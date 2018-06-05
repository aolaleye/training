package com.synechron.basicdemo.entrypoint;

import com.synechron.basicdemo.printdemo.EmployeeInformation;

public class ApplicationMain {

	public static void main(String[] args) {
		
		EmployeeInformation emp1 = new EmployeeInformation(24, "Abby");
		emp1.DisplayInformation();
		
		EmployeeInformation emp2 = new EmployeeInformation(45, "Sam");
		emp2.DisplayInformation();

	}

}
