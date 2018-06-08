package com.synechron.loopdemo.loops;

public class Loop1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("The value of i is: " + i);
		}
		
		int count = 0;
		while (count < 10) {
			System.out.println("The value of count is: " + count);
			count++;
		}
			
		int j = 5;
		do {
			j++;
			System.out.println("The value of j is: " + j);	
		} while (j < 15);
			
	}
}
