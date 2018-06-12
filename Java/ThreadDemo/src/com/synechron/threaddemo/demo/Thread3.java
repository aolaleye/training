package com.synechron.threaddemo.demo;

//public class Thread3 extends Thread {
public class Thread3 implements Runnable {
	
	@Override
	public void run() {

		for(int i = 21; i <= 40; i++) {
	
			System.out.println(i);
	
		}

	}

}
