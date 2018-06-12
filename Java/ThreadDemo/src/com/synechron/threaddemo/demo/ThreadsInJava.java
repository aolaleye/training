package com.synechron.threaddemo.demo;

public class ThreadsInJava {
	
	public static void main(String[] args) {
		
//		//Creating first thread
//		Thread2 t1 = new Thread2();
//		t1.start();
//
//		//Creating second thread
//		Thread3 t2 = new Thread3();
//		t2.start();
		
		Thread2 third = new Thread2(); 
		Thread t3 = new Thread(third);
		t3.start();
		t3.setName("Counting 1 through 20");
		String name3 = t3.getName();
		
		
		Thread3 fourth = new Thread3(); 
		Thread t4 = new Thread(fourth);
		t4.start();
		t4.setName("Counting 21 through 40");
		String name4 = t4.getName();
		
		System.out.println(name3);
		System.out.println(name4);

	}

}
