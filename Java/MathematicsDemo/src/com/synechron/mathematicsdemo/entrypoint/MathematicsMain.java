package com.synechron.mathematicsdemo.entrypoint;

import com.synechron.mathematicsdemo.printdemo.Addition;
import com.synechron.mathematicsdemo.printdemo.Multiplication;

public class MathematicsMain {
	
public static void main(String[] args) {
		
		Addition add1 = new Addition(4, 10);
		add1.AddNumbers();
		Addition add2 = new Addition(6, 22);
		add2.AddNumbers();
		Addition add3 = new Addition();
		add3.AddNumbers();
		
		Multiplication multiply1 = new Multiplication(4, 8);
		multiply1.MultiplyNumbers();
		Multiplication multiply2 = new Multiplication(40, 3);
		multiply2.MultiplyNumbers();
		Multiplication multiply3 = new Multiplication();
		multiply3.MultiplyNumbers();

	}

}
