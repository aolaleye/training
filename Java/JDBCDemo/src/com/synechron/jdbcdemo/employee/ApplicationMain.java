package com.synechron.jdbcdemo.employee;

public class ApplicationMain {

	public static void main(String[] args) {
		EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
		employeeDaoImpl.createEmployeeInDatabase();
	}

}