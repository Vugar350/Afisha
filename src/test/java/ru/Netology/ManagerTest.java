package ru.Netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    MovieManager manager = new MovieManager();

    private Movie first = new Movie(1, "рокки", "action");
    private Movie second = new Movie(2, "The Gentlemen", "action");
    private Movie third = new Movie(3, "The Green Mile", "Drama");
    private Movie fourth = new Movie(4, "Zootopia", "Animated film");
    private Movie fifth = new Movie(5, "Matrix", "action");
    private Movie sixth = new Movie(6, "Avengers: Infinity War", "action");
    private Movie seventh = new Movie(7, "Titanic", "Drama");
    private Movie eighth = new Movie(8, "Lion King", "Animated film");
    private Movie ninth = new Movie(9, "Gladiator", "Drama");
    private Movie tenth = new Movie(10, "Ratatouille", "Animated film");


    Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};


    @Test
    void mustShowTenMovie() {
        MovieManager manager = new MovieManager(10);
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
        Movie[] actual = manager.getLastAdd(10);
        assertArrayEquals(expected, actual);
    }

    @Test
    void mustShowNothing() {
        MovieManager manager = new MovieManager();
        Movie[] actual = manager.getLastAdd(0);
        Movie [] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }




    @Test
    void mustShowOverMax() {
        MovieManager manager = new MovieManager(2);
        manager.addMovie(first);
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
        Movie[] actual = manager.getLastAdd(10);
        assertArrayEquals(expected, actual);

    }



}
