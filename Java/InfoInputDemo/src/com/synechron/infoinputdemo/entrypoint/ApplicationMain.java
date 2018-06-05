package com.synechron.infoinputdemo.entrypoint;

import java.util.Scanner;

import com.synechron.infoinputdemo.printdemo.UserInfo;

public class ApplicationMain {
	
	public static void main(String[] args) {
		UserInfo user1 = new UserInfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		user1.PrintAge(age);
		sc.close();
	}

}
