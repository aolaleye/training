package com.synechron.jdbcdemo.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoImpl {
	public boolean createEmployeeInDatabase() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abby", "training");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next())
				System.out.println("EmpID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ",  DeptNo: " + rs.getInt(3));
			} catch (Exception e) {
				System.out.println(e);
			}

		return true;
	}
}
