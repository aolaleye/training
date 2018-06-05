package com.synechron.infoinputdemo.printdemo;

public class UserInfo {
	int votingAge;
	
	public void PrintAge(int age) {
		if (age >= 18) {
			System.out.println("You are eligible to vote!");
		} else {
			System.out.println("Sorry, you are not old enough to vote.");
		}
	}
	
//	public void SwitchCase() {
//		switch (votingAge) {
//		case 18:
//			System.out.println("You are eligible to vote!");
//		default:
//			System.out.println("Sorry, you are not old enough to vote.");
//		}
//	}
	
}
