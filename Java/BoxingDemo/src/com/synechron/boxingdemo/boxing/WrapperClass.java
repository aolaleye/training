package com.synechron.boxingdemo.boxing;

public class WrapperClass {
	
	public static void main(String[] args) {
//		int i = 100;
//		
//		Integer iobj = Integer.valueOf(i);
//		Integer iobj1 = i;
//		System.out.println("iobj: " + iobj);
		
		Integer iobj = Integer.valueOf(100);
		Integer iobj1 = Integer.valueOf(50);
		
		int i = iobj.intValue();
		int j = iobj1;
		
		System.out.println("Value of i: " + i);
		System.out.println("Value of j: " + j);
		System.out.println("Sum of i and j: " + (i + j));
	}

}
