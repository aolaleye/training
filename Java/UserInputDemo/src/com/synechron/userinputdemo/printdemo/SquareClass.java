package com.synechron.userinputdemo.printdemo;

public class SquareClass {
	int square;
	public int CalculateSquare(int value1) {
		square = value1 * value1;
		return square;
	}
	
	public void PrintResults() {
		System.out.println("The square of the number is: " + square);
	}
}
