package com.syncechron.exceptiondemo.noexception;

public class NoException {

	public static void main(String[] args) {
		
//		ExceptionTest obj1 = new ExceptionTest();
//		
//		try {
//			obj1.divideNumber();
//		} catch (Exception e) {
//			System.out.println(e);
//			e.printStackTrace();
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
//		}
//		
//		finally {
//			System.out.println("This is the Finally Block being executed");
//		}
//		
//		int age = 15;
//		
//		if (age <18) {
//			throw new ArithmeticException("Not old enough to vote");
//		} else {
//			System.out.println("You can vote");
//		}
		

			try {
				int i = 10;
				i = i / 0;
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			catch (Exception e1) {
				System.out.println(e1);
			}
			System.out.println("Multiple try-catch block");
		


	}

}
