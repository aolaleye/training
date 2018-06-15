package com.synechron.finalassignmentdemo.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class FinalAssigment {
	
	public static void main(String[] args) {
		
//		1. Write a Java program that takes two numbers as input and display the product of two numbers.
		System.out.println("------------ 1. -------------");

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		   
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		   
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

		

//		2. Write a Java program to print the area and perimeter of a circle.	
		System.out.println("------------ 2. -------------");

		double radius = 7.5;
		double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);


        
//		3. Write a Java program to convert a decimal number to binary number.		
		System.out.println("------------ 3. -------------");

		int decimal;
		int quotient; 
		int f = 1;
        int binary[] = new int[100];
		
        System.out.print("Input a Decimal Number : ");
        decimal = sc.nextInt();
		
        quotient = decimal;
		
        while (quotient != 0) {
            binary[f++] = quotient % 2;
            quotient = quotient / 2;
        }
		
        System.out.print("The Binary number is: ");
        for (int j = f - 1;  j > 0;  j--) {
            System.out.print(binary[j]);
        }
        System.out.println(" ");
		
        
        
//		4. Write a Java program to check whether Java is installed on your computer.        
		System.out.println("------------ 4. -------------");

		System.out.println("Java Version: " + System.getProperty("java.version"));
	    System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
	    System.out.println("Java Home: " + System.getProperty("java.home"));
	    System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
	    System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
	    System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

	    
	    
//		5. Write a Java program and compute the sum of the digits of an integer.
		System.out.println("------------ 5. -------------");
		
		int sum = 0;
		
		System.out.print("Input an integer: ");
        long l1 = sc.nextLong();
    		
    	while (l1 != 0) {
    		sum += l1 % 10;
    		l1 /= 10;
    	}
        System.out.println("The sum of the digits is: " + sum);


        
//		6. Write a Java program to reverse a string.
		System.out.println("------------ 6. -------------");
		
		String reverse;
		System.out.println("Input a string: ");
		reverse = sc.next();
		StringBuffer buffer = new StringBuffer(reverse);
		System.out.println(buffer.reverse()); 


		
//		7. Write a Java program to find the size of a specified file.
		System.out.println("------------ 7. -------------");
		
		System.out.println("/home/students/apples.txt  : " + new File("apples.txt").length() + " bytes");
		System.out.println("/home/students/oranges.txt : " + new File("oranges.txt").length() + " bytes");
		
		
		
//		8. Write a Java program to extract the first half of a string of even length.
		System.out.println("------------ 8. -------------");
		
		 String extract = "Hellicoptor";    
		 System.out.println(extract.substring(0, extract.length()/2));


		 
//		9. Take three numbers from the user and print the greatest number.
		System.out.println("------------ 9. -------------");
		
		System.out.print("Input the first number: ");
		int number1 = sc.nextInt();
		   
		System.out.print("Input the second number: ");
		int number2 = sc.nextInt();
		   
		System.out.print("Input the third number: ");
		int number3 = sc.nextInt();
		
		if (number1 > number2 && number1 > number3)
		    System.out.println("The greatest: " + number1);
		   
		if (number2 > num1 && number2 > number3)
		    System.out.println("The greatest: " + number2);
		   
		if (number3 > num1 && number3 > number2)
		    System.out.println("The greatest: " + number3);

		
		
//		10. Write a Java program to find the number of days in a month.
		System.out.println("----------- 10. ------------");
		
		System.out.println("Enter the month number:");
		int month = sc.nextInt();
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.YEAR, year);
	    cal.set(Calendar.MONTH, month);
	    int daysInMonth = cal.getActualMaximum(cal.DAY_OF_MONTH);
	   
	    System.out.println(month + " " + year + " has " + daysInMonth + "days");


	    
//		11. Write a program in Java to display the cube of the number up to given an integer.		
		System.out.println("----------- 11. ------------");
		
		int d, cube;

	    System.out.print("Input number of terms : ");
		cube = sc.nextInt();

	    for ( d = 1; d <= cube; d++) {
	    	System.out.println("The cube of " + d +"  is : "+ (d * d * d));     
	    }

	    
	    
//		12. Write a Java program to sort a numeric array and a string array.	
		System.out.println("----------- 12. ------------");
		
		int[] numericArray = {
	            36, 499, 61, 13, 43, 
	            589, 232, 154, 12, 23, 
	            45, 165, 57, 256
	    };
	            
	    String[] stringArray = {
	            "Java",
	            "HTML",
	            "CSS",
	            "C#",
	            "JavaScript",
	            "PHP"
	     };   
	    
	    System.out.println("Numeric Array : "+ Arrays.toString(numericArray));
	    Arrays.sort(numericArray);
	    System.out.println("Sorted Numeric Array : "+Arrays.toString(numericArray));
	    
	    System.out.println("String Array : "+ Arrays.toString(stringArray));
	    Arrays.sort(stringArray);
	    System.out.println("Sorted String Array : "+ Arrays.toString(stringArray));

	    

//		13. Write a Java program to test if an array contains a specific value.
		System.out.println("----------- 13. ------------");
		
		int[] num = {1, 2, 3, 4, 5};
		int findValue = 3;
		boolean found = false;

		for (int n : num) {
			if (n == findValue) {
                found = true;
                break;
            }
		}

		if (found) {
            System.out.println(findValue + " is in the array");
		} else {
            System.out.println(findValue + " is not in the array.");
		}
        
		
		
//		14. Write a Java program to find the index of an array element.
		System.out.println("----------- 14. ------------");
		
		int[] indexArray = { 5, 8, 3, 7 };
		int element = 3;
		int index = 0;

		for (int z = 0; z < indexArray.length; z++) {
		     if (element == indexArray[z]) {
		         index = z;
		     }
		}
		System.out.println("The index of " + element + " is: " + index);
		
		
		
//		15. Write a Java program to remove a specific element from an array.
		System.out.println("----------- 15. ------------");
		
		int[] newArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   
		System.out.println("Original Array: " + Arrays.toString(newArray));     
		int removeIndex = 1;
		
		System.out.println("Element to be removed: " + newArray[removeIndex]);     

		for (int h = removeIndex; h < newArray.length -1; h++) {
		        newArray[h] = newArray[h + 1];
		}
		System.out.println("After removing the element: "+Arrays.toString(newArray));
		
		
		
//		16. Write a Java program to copy an array by iterating the array.
		System.out.println("----------- 16. ------------");
		
		int[] firstArray = {30, 26, 80, 91, 31, 67, 99, 45, 12, 56};
		int[] copyArray = new int[10];     
		 
		System.out.println("First Array : " + Arrays.toString(firstArray));     
		   
		for(int c = 0; c < firstArray.length; c++) {
		    copyArray[c] = firstArray[c];
		}
		System.out.println("Copy of Array: " + Arrays.toString(copyArray));
		
		System.out.println("----------- 17. ------------");
		
		
		
//		17. Write a Java program to insert an element (specific position) into an array.
		
		int[] numbersArray = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11};
	   
		int newIndex = 4;
		int newElement =5 ;

		System.out.println("Original Array : "+Arrays.toString(numbersArray));     
	   
		for(int e = numbersArray.length-1; e > newIndex; e--){
			numbersArray[e] = numbersArray[e - 1];
		}
		numbersArray[newIndex] = newElement;
	   System.out.println("New Array: "+Arrays.toString(numbersArray));

	   

//		18. Write a Java program to find the maximum and minimum value of an array
		System.out.println("----------- 18. ------------");

		int[] minMaxArray = {59, 27, 32, 155, 362, 569, 986, 180, 79, 26};
		int max = minMaxArray[0];
        int min = minMaxArray[0];

        for (int i = 1; i < minMaxArray.length - 1; i = i + 2) {
            if (i + 1 > minMaxArray.length) {
                if (minMaxArray[i] > max) max = minMaxArray[i];
                if (minMaxArray[i] < min) min = minMaxArray[i];
            }
            if (minMaxArray[i] > minMaxArray[i + 1]) {
                if (minMaxArray[i] > max) max = minMaxArray[i];
                if (minMaxArray[i + 1] < min) min = minMaxArray[i + 1];
            }
            if (minMaxArray[i] < minMaxArray[i + 1]) {
                if (minMaxArray[i] < min) min = minMaxArray[i];
                if (minMaxArray[i + 1] > max) max = minMaxArray[i + 1];
            }
        }
         System.out.println("Array: " + Arrays.toString(minMaxArray));
         System.out.println("Min: " + min);
         System.out.println("Max: " + max);
		
         
         
// 		19. Write a Java program to find the number of even and odd integers in a given array of integers
		System.out.println("----------- 19. ------------");

		int[] evenOddArray = {11, 21, 32, 44, 25, 16, 67, 78, 98, 10, 116, 122, 131, 149, 153, 160, 173, 184, 193, 204};
		System.out.println("Array: " + Arrays.toString(evenOddArray)); 
		int remainder = 0;
		for(int i = 0; i < evenOddArray.length; i++)
		{
			if(evenOddArray[i] % 2 == 0)
				remainder++;
		}
		System.out.println("Number of Even Numbers : " +remainder);
		System.out.println("Number of Odd Numbers  : " + (evenOddArray.length - remainder));

		
		
//		20. Write a Java program to get the character at the given index within the String.
		System.out.println("----------- 20. ------------");
		
		String str = "The chicken crossed the road to get to the other side";
        System.out.println("String = " + str);
   
        int index1 = str.charAt(4);
        int index2 = str.charAt(22); 

        System.out.println("The character at index 5 is: " + (char)index1);
        System.out.println("The character at index 21 is: " + (char)index2);

		
        
//		21. Write a java program to compare two strings lexicographically, ignoring case differences.
		System.out.println("----------- 21. ------------");
		
		String str1 = "chocolate cake with vanilla icing";
        String str2 = "Chocolate Cake with Vanilla Icing";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
       
        int result = str1.compareToIgnoreCase(str2);

        if (result < 0)  {
            System.out.println("\"" + str1 + "\"" + " is less than " + "\"" + str2 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\"" + " is greater than " + "\"" + str2 + "\"");
        }
		
        
        
//		22. Write a Java program to convert all the characters in a string to uppercase.
		System.out.println("----------- 22. ------------");
		
		String toUppercase = "cake and pie are equally delicious!";

        String Uppercase = toUppercase.toUpperCase();

        System.out.println("String: " + toUppercase);
        System.out.println("Uppercase String: " + Uppercase);
		
        
        
//		23. Write a Java program to trim any leading or trailing whitespace from a given string.
		System.out.println("----------- 23. ------------");
		
		String untrimmed = " Too Many Spaces ";
        String trimmed = untrimmed.trim();

        System.out.println("Untrimmed String: " + untrimmed);
        System.out.println("Trimmed String: " + trimmed);
		
        
        
//		24. Write a Java method to print characters between two characters (i.e. A to P ).
		System.out.println("----------- 24. ------------");
		
		char character1 = '(';
		char character2 = 'z';
		
		for (int p = 1; character1 <= character2; p++, character1++) {
            System.out.print(character1 + " ");
            if (p % 20 == 0) System.out.println("");
		}
		System.out.println(" ");
		

		
//		26. Write a Java program to generate random integers in a specific range.	
		System.out.println("----------- 26. ------------");
		
		System.out.print("Input the Starting Number: "); 
        int starting = sc.nextInt(); 
        System.out.print("Input the Ending Number: "); 
        int ending = sc.nextInt(); 
	    int random = starting + (int)(Math.random() * ((ending - starting) + 1));
	    System.out.println("Random Number between " + starting + " and " + ending + ": " + random);
		
	    
	    
//		27. Write a Java program to get a list of all file/directory names from the given.
		System.out.println("----------- 27. ------------");
		
		File file = new File("/Library");
        String[] fileList = file.list();
        for (String name: fileList) {
            System.out.println(name);
        }

		
		
		sc.close();
		
	}

}
