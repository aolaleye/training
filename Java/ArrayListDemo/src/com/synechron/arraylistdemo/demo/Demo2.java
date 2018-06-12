package com.synechron.arraylistdemo.demo;

import java.util.ArrayList;

public class Demo2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ZERO");
		list.add("TWO");
		list.add("FOUR");
		
		System.out.println(list);
		
		list.add(2, "THREE");
		list.add(1, "ONE");
		
		System.out.println(list);
		
		list.remove(3);
		
		System.out.println(list);
	}

}
