package com.synechron.moviedemo.movie;

import java.util.Comparator;

public class Rating implements Comparator<Movie> {
	
	public int compare(Movie m1, Movie m2) {

		if (m1.getRating() < m2.getRating()) {
			return -1;
		}

		if (m1.getRating() > m2.getRating()) {
			return 1;
		}

		else return 0;

	}

}
