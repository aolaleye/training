package com.synechron.arraylistdemo.demo;

import java.util.ArrayList;

public class Demo5 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("ONE");
		
		list1.add("TWO");
		
		list1.add("THREE");
		
		list1.add("FOUR");
		
		System.out.println(list1);
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("THREE");
		
		list2.add("FOUR");
		
		list2.add("FIVE");
		
		list2.add("SIX");
		
		System.out.println(list2);
		
		

		list1.addAll(list2);
		
		System.out.println(list1);
		
		
		list1.removeAll(list2);
		
		System.out.println(list1);
		
		
		list1.addAll(2, list2);
		
		System.out.println(list1);
		
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		
		
		list1.clear();
		
		System.out.println(list1);

	}

}
