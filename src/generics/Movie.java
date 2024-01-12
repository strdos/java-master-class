package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie implements Comparable<Movie> {

    private final String name;
    private final double rating;
    private final int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    @Override
    public String toString() {
        return name + ", " + rating + ", " + year;
    }
}

class MovieMain {
    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Force Awakens", 8.3, 2015));
        movies.add(new Movie("Star Wars", 8.7, 1977));
        movies.add(new Movie("Empire Strikes Back", 8.8, 1980));
        movies.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(movies);

        for (var m: movies) {
            System.out.println(m.toString());
        }

    }
}
