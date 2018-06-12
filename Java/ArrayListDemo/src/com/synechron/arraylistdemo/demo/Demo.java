package com.synechron.arraylistdemo.demo;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		
		System.out.println(list.size());
		
		list.add("FOUR");
		list.add("FIVE");
		
		System.out.println(list.size());
		
		list.remove("TWO");
		
		System.out.println(list.size());
		
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.indexOf("THREE"));
		
		
		
		
	}

}
