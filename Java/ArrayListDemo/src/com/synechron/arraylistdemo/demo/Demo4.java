package com.synechron.arraylistdemo.demo;

import java.util.ArrayList;

public class Demo4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ONE");
		
		list.add("TWO");
		
		list.add("THREE");
		
		list.add("FOUR");
		
		System.out.println(list);
		
		
		list.add(3, "INSERTED");
		
		System.out.println(list);
		
		
		list.add(1, "INSERTED");
		
		System.out.println(list);
		
		
		list.remove("INSERTED");
		
		System.out.println(list);
		
		
		list.remove(3);
		
		System.out.println(list);
		
		
		list.set(3, "REPLACED");
		
		System.out.println(list);

		
	}

}
