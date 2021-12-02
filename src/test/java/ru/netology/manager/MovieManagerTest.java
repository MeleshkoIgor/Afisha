package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    @Test
    public void shouldAddNullMovie() {
        MovieManager manager = new MovieManager(0);
        manager.addMovie(null);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd1MovieWithConstructor() {
        MovieManager manager = new MovieManager(1);
        Movie first = new Movie(1, "First", "comedy", "www.comedy.com");
        manager.addMovie(first);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd1MovieWithoutConstructor() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "First", "comedy", "www.comedy.com");
        manager.addMovie(first);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd10MovieWithConstructor() {
        MovieManager manager = new MovieManager(10);
        Movie first = new Movie(1, "First", "comedy", "www.comedy.com");
        Movie second = new Movie(2, "Second", "thriller", "www.thriller.com");
        Movie third = new Movie(3, "Third", "drama", "www.drama.com");
        Movie fourth = new Movie(4, "Fourth", "adventure", "www.adventure.com");
        Movie fifth = new Movie(5, "Fifth", "cartoon", "www.cartoon.com");
        Movie sixth = new Movie(6, "Sixth", "thriller", "www.thriller.com");
        Movie seventh = new Movie(7, "Seventh", "cartoon", "www.cartoon.com");
        Movie eighth = new Movie(8, "Eighth", "adventure", "www.adventure.com");
        Movie ninth = new Movie(9, "Ninth", "cartoon", "www.cartoon.com");
        Movie tenth = new Movie(10, "Tenth", "comedy", "www.comedy.com");

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd10MovieWithoutConstructor() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "First", "comedy", "www.comedy.com");
        Movie second = new Movie(2, "Second", "thriller", "www.thriller.com");
        Movie third = new Movie(3, "Third", "drama", "www.drama.com");
        Movie fourth = new Movie(4, "Fourth", "adventure", "www.adventure.com");
        Movie fifth = new Movie(5, "Fifth", "cartoon", "www.cartoon.com");
        Movie sixth = new Movie(6, "Sixth", "thriller", "www.thriller.com");
        Movie seventh = new Movie(7, "Seventh", "cartoon", "www.cartoon.com");
        Movie eighth = new Movie(8, "Eighth", "adventure", "www.adventure.com");
        Movie ninth = new Movie(9, "Ninth", "cartoon", "www.cartoon.com");
        Movie tenth = new Movie(10, "Tenth", "comedy", "www.comedy.com");

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMore10MovieWithConstructor() {
        MovieManager manager = new MovieManager(10);
        Movie first = new Movie(1, "First", "comedy", "www.comedy.com");
        Movie second = new Movie(2, "Second", "thriller", "www.thriller.com");
        Movie third = new Movie(3, "Third", "drama", "www.drama.com");
        Movie fourth = new Movie(4, "Fourth", "adventure", "www.adventure.com");
        Movie fifth = new Movie(5, "Fifth", "cartoon", "www.cartoon.com");
        Movie sixth = new Movie(6, "Sixth", "thriller", "www.thriller.com");
        Movie seventh = new Movie(7, "Seventh", "cartoon", "www.cartoon.com");
        Movie eighth = new Movie(8, "Eighth", "adventure", "www.adventure.com");
        Movie ninth = new Movie(9, "Ninth", "cartoon", "www.cartoon.com");
        Movie tenth = new Movie(10, "Tenth", "comedy", "www.comedy.com");
        Movie elleventh = new Movie(11, "Elleventh", "drama", "www.drama.com");

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(elleventh);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{elleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMore10MovieWithoutConstructor() {
        MovieManager manager = new MovieManager(10);
        Movie first = new Movie(1, "First", "comedy", "www.comedy.com");
        Movie second = new Movie(2, "Second", "thriller", "www.thriller.com");
        Movie third = new Movie(3, "Third", "drama", "www.drama.com");
        Movie fourth = new Movie(4, "Fourth", "adventure", "www.adventure.com");
        Movie fifth = new Movie(5, "Fifth", "cartoon", "www.cartoon.com");
        Movie sixth = new Movie(6, "Sixth", "thriller", "www.thriller.com");
        Movie seventh = new Movie(7, "Seventh", "cartoon", "www.cartoon.com");
        Movie eighth = new Movie(8, "Eighth", "adventure", "www.adventure.com");
        Movie ninth = new Movie(9, "Ninth", "cartoon", "www.cartoon.com");
        Movie tenth = new Movie(10, "Tenth", "comedy", "www.comedy.com");
        Movie elleventh = new Movie(11, "Elleventh", "drama", "www.drama.com");

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(elleventh);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{elleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }
}