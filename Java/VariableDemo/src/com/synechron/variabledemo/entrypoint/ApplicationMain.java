package com.synechron.variabledemo.entrypoint;

import com.synechron.variabledemo.variabletypedemo.VariableClass;

public class ApplicationMain {
	
	public static void main(String[] args) {
		
		VariableClass obj1 = new VariableClass();
		VariableClass obj2 = new VariableClass();
		
		obj1.setEmpID(10);
		obj2.setEmpID(11);
		
		obj1.getEmpID();
		obj2.getEmpID();
	
	}
	


}
