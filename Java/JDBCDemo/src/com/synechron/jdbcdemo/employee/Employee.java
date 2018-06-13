package com.synechron.jdbcdemo.employee;

public class Employee {

	int empId;
	String empName;
	int deptno;
	
	public Employee(int empId, String empName, int deptno) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptno = deptno;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getDeptno() {
		return deptno;
	}
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}
