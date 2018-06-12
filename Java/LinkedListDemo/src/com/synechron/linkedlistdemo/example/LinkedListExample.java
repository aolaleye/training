package com.synechron.linkedlistdemo.example;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		
		// ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ArrayList Item1");
	    list.add("ArrayList Item2");
	    list.add("ArrayList Item3");
	    list.add("ArrayList Item4");
	    list.add("ArrayList Item5");
	    
	    System.out.println(list);
	    
		//LinkedList
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("LinkedList Item1");
	    list1.add("LinkedList Item2");
	    list1.add("LinkedList Item3");
	    list1.add("LinkedList Item4");
	    list1.add("LinkedList Item5");
	    
	    System.out.println(list1);
	    
	    //HashSet
	    HashSet<String> list2 = new HashSet<String>();
	    
	    list2.add("HashSet Item1");
	    list2.add("HashSet Item2");
	    list2.add("HashSet Item3");
	    list2.add("HashSet Item4");
	    list2.add("HashSet Item5");
	    
	    System.out.println(list2);
	    
	    //HashMap
	    HashMap<Integer, String> list3 = new HashMap<Integer, String>();
	    
	    list3.put(1, "HashMap Item");
	    list3.put(2, "HashMap Item");
	    list3.put(3, "HashMap Item");
	    list3.put(4, "HashMap Item");
	    list3.put(5, "HashMap Item");
	    
	    System.out.println(list3);
	    
	    

	}

}
