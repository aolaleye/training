package com.synechron.moviedemo.movie;

import java.util.Comparator;

public class Name implements Comparator<Movie> {
	
	public int compare(Movie m1, Movie m2) {

		return m1.getName().compareTo(m2.getName());

	}


}
