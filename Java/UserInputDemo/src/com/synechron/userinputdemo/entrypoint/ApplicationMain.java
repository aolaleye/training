package com.synechron.userinputdemo.entrypoint;

import java.util.Scanner;

import com.synechron.userinputdemo.printdemo.SquareClass;

public class ApplicationMain {
	
//	public static void main(String[] args) {
//		
//		SquareClass square1 = new SquareClass();
//		square1.CalculateSquare(5);
//		square1.PrintResults();
//		
//	}
	
	public static void main(String[] args) {
		
		SquareClass square1 = new SquareClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value: ");
		int number1 = sc.nextInt();
		square1.CalculateSquare(number1);
		square1.PrintResults();
		sc.close();
		
	}

}
