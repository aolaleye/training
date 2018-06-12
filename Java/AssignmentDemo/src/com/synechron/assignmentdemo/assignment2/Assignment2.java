package com.synechron.assignmentdemo.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Assignment2 {

	public static void main(String[] args) {
		
//		1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		
		System.out.println("#1:");
		System.out.println(colors);
		System.out.println("-----------------------------------");

//		2. Write a Java program to iterate through all elements in a array list.
		System.out.println("#2:");
		for (String i : colors) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------");

//		3. Write a Java program to insert an element into the array list at the first position.
		System.out.println("#3:");
		colors.add(0, "Orange");
		System.out.println(colors);
		System.out.println("-----------------------------------");

//		4. Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println("#4:");
		System.out.println(colors.get(2));
		System.out.println("-----------------------------------");

//		5. Write a Java program to update specific array element by given element.
		System.out.println("#5:");
		colors.set(3, "Yellow");
		System.out.println(colors);
		System.out.println("-----------------------------------");

//		6. Write a Java program to remove the third element from a array list.
		System.out.println("#6:");
		colors.remove(2);
		System.out.println(colors);
		System.out.println("-----------------------------------");

//		7. Write a Java program to search an element in a array list.
		System.out.println("#7:");
		System.out.println(colors.indexOf("Blue"));
		System.out.println("-----------------------------------");

//		8. Write a Java program to sort a given array list.
		System.out.println("#8:");
		Collections.sort(colors);
		System.out.println(colors);
		System.out.println("-----------------------------------");

//		9. Write a Java program to copy one array list into another.
		System.out.println("#9:");
		ArrayList<String> colors2 = new ArrayList<String>();
		colors2.addAll(colors);
		System.out.println(colors2);
		System.out.println("-----------------------------------");

//		10. Write a Java program to shuffle elements in a array list.
		System.out.println("#10:");
		Collections.shuffle(colors);
		System.out.println(colors);
		System.out.println("-----------------------------------");

//		11. Write a Java program to reverse elements in a array list.
		System.out.println("#11:");
		ArrayList<String> numbers = new ArrayList<String>();
		numbers.add("Zero");
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");

		ListIterator iterator = numbers.listIterator();
		
		System.out.println("Original Order: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(" "); 

		System.out.println("Reversed Order: "); 
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		System.out.println("-----------------------------------");

//		12. Write a Java program to extract a portion of a array list.
		System.out.println("#12:");
		ArrayList<String> evenNumbers = new ArrayList<String>();
		evenNumbers.add(numbers.get(0));
		evenNumbers.add(numbers.get(2));
		System.out.println(evenNumbers);
		System.out.println("-----------------------------------");

//		13. Write a Java program to compare two array lists.
		System.out.println("#13:");
		ArrayList<String> languages = new ArrayList<String>();
		languages.add("HTML");
		languages.add("CSS");
		languages.add("JAVA");
	    
	    ArrayList<String> languages2 = new ArrayList<String>();
	    languages2.add("C#");
	    languages2.add("JavaScript");
	    languages2.add("Ruby");
	    
	    System.out.println(languages.equals(languages2));
	    System.out.println("-----------------------------------");

//		14. Write a Java program of swap two elements in an array list.
	    System.out.println("#14:");
		Collections.swap(numbers, 1,3);
		System.out.println(numbers);
		System.out.println("-----------------------------------");

//		15. Write a Java program to join two array lists.
		System.out.println("#15:");
		languages.addAll(languages2);
		System.out.println(languages);
		System.out.println("-----------------------------------");

//		16. Write a Java program to clone an array list to another array list.
		System.out.println("#16:");
		ArrayList<String> fruits = new ArrayList<String>();
	     fruits.add("Apple");
	     fruits.add("Orange");
	     fruits.add("Mango");
	     fruits.add("Grapes");
	     
	     ArrayList<String> clone = (ArrayList<String>)fruits.clone();
	     System.out.println(clone);
	     System.out.println("-----------------------------------");

//		17. Write a Java program to empty an array list.
		System.out.println("#17:");
		languages.clear();
		System.out.println(languages);
		System.out.println("-----------------------------------");

//		18. Write a Java program to test an array list is empty or not.
		System.out.println("#18:");
		if (languages.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else System.out.println("The ArrayList is not empty");
		System.out.println("-----------------------------------");

//		19. Write a Java program to trim the capacity of an array list the current list size.
		System.out.println("#19:");
		ArrayList<String> capacity = new ArrayList<String>();
        capacity.add("Bike");
        capacity.add("Car");
        capacity.add("Boat");

        capacity.trimToSize();
        System.out.println(capacity);
        System.out.println("-----------------------------------");

//		20. Write a Java program to increase the size of an array list.
        System.out.println("#20:");
		capacity.ensureCapacity(6);
		
		capacity.add("Motorcycle");
        capacity.add("Scooter");
        capacity.add("Skateboard");
        System.out.println(capacity);
        System.out.println("-----------------------------------");

//		21. Write a Java program to replace the second element of a ArrayList with the specified element.
        System.out.println("#21:");
		capacity.set(1, "Yaht");
		System.out.println(capacity);
		System.out.println("-----------------------------------");

//		22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
		System.out.println("#22:");
		int size = colors.size();
		  for (int i = 0; i < size; i++) {
		   System.out.println(i + ". " + colors.get(i));
		 }
		System.out.println("-----------------------------------");
		
//		23. Comparator/Comparable example.
		System.out.println("#23:");
		List<Vehicle> car = new ArrayList<Vehicle>();
		
		car.add(new Vehicle("Toyota", "Corolla", 18050));
		car.add(new Vehicle("Nissan", "Pathfinder", 24350));
		car.add(new Vehicle("Jeep", "Wrangler", 26560));
		
		Comparator <Vehicle> compare = new Comparator<Vehicle>() {

			@Override
			public int compare(Vehicle v1, Vehicle v2) {
				if (v1.getPrice() > v2.getPrice()) {
					return 1;
				} else return -1; 
			}
			
		};
		
		Collections.sort(car, compare);
		for (Vehicle i : car) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------");
		
	}

}
