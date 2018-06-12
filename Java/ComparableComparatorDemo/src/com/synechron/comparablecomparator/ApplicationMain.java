package com.synechron.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ApplicationMain {

	public static void main(String[] args) {
		
		List<Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 4, 1800));
		laps.add(new Laptop("Acer", 8, 1200));
		
		Comparator <Laptop> com = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop l1, Laptop l2) {
				if (l1.getPrice() > l2.getPrice()) {
					return 1;
				} else return -1; 
			}
			
		};
		
		Collections.sort(laps, com);
		for (Laptop l : laps) {
			System.out.println(l);
		}
		
	}

}
