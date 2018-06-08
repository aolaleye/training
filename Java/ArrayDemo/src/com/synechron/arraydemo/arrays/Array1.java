package com.synechron.arraydemo.arrays;

public class Array1 {

	public static void main(String[] args) {
		
		int numbersArray[] = {2, 4, 6, 8, 10};
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.println("numbersArray: " + numbersArray[i]);
		}
		
		
		
		String stringsArray[] = {"Mary", "James", "Matthew"};
		for (int i = 0; i < stringsArray.length; i++) {
			System.out.println("stringsArray: " + stringsArray[i]);
		}
		
		
		
		String newStr[] = new String[5];
		newStr[0] = "a";
		newStr[1] = "b";
		newStr[2] = "c";
		newStr[3] = "d";
		newStr[4] = "e";
		for (String i : newStr) {
			System.out.println("i: " + i);
		}
		
		


	}

}
