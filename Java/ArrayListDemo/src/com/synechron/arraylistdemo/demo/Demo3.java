package com.synechron.arraylistdemo.demo;

import java.util.ArrayList;

public class Demo3 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("ZERO");
		
		list.add(1);
		
		list.add(20.24);
		
		list.add(new Float(23.56));
		
		list.add(new Long(25));
		
		System.out.println(list);
		
	}


}
