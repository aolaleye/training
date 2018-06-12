package com.synechron.threaddemo.demo;

//public class Thread2 extends Thread {
public class Thread2 implements Runnable {
	
	@Override
	public void run() {

		for(int i = 0; i <= 20; i++) {
	
			System.out.println(i);
	
		}

	}

}
