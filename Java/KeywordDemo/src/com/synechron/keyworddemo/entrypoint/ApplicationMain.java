package com.synechron.keyworddemo.entrypoint;

import com.synechron.keyworddemo.keyword.Child;
import com.synechron.keyworddemo.keyword.Keyword;

public class ApplicationMain {
	
	public static void main(String[] args) {
		Keyword demo = new Keyword(111);
		demo.display();
		Child childdemo = new Child();
	}
}
