package com.synechron.moviedemo.movie;

import java.util.ArrayList;
import java.util.Collections;

public class ApplicationMain {

	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<Movie>();

		list.add(new Movie("Force Awakens", 8.3, 2015));

		list.add(new Movie("Star Wars", 8.7, 1977));

		list.add(new Movie("Empire Strikes Back", 8.8, 1980));

		list.add(new Movie("Return of the Jedi", 8.4, 1983));
		
		
//		Collections.sort(list);
//
//		System.out.println("Movies after sorting : ");
//
//		for (Movie movie: list)
//
//		{
//
//		System.out.println(movie.getName() + " " +
//
//		movie.getRating() + " " +
//
//		movie.getYear());
//
//		}
		
		
		// Sort by rating : (1) Create an object of ratingCompare

		// (2) Call Collections.sort

		// (3) Print Sorted list

		System.out.println("Sorted by rating");

		Rating rating = new Rating();

		Collections.sort(list, rating);

		for (Movie movie: list) {

			System.out.println(movie.getRating() + " " +
	
			movie.getName() + " " +
	
			movie.getYear());
			
		}
		

		// Call overloaded sort method with RatingCompare

		// (Same three steps as above)

		System.out.println("\nSorted by name");

		Name name = new Name();

		Collections.sort(list, name);

		for (Movie movie: list) {

			System.out.println(movie.getName() + " " +
	
			movie.getRating() + " " +
	
			movie.getYear());
			
		}
		

		// Uses Comparable to sort by year

		System.out.println("\nSorted by year");

		Collections.sort(list);

		for (Movie movie: list) {

			System.out.println(movie.getYear() + " " +
	
			movie.getRating() + " " +
	
			movie.getName()+" ");

		}

	}

}
