package ru.Netology;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    Manager manager = new Manager();

    private Films first = new Films(1, "рокки", "action");
    private Films second = new Films(2, "The Gentlemen", "action");
    private Films third = new Films(3, "The Green Mile", "Drama");
    private Films fourth = new Films(4, "Zootopia", "Animated film");
    private Films fifth = new Films(5, "Matrix", "action");
    private Films sixth = new Films(6, "Avengers: Infinity War", "action");
    private Films seventh = new Films(7, "Titanic", "Drama");
    private Films eighth = new Films(8, "Lion King", "Animated film");
    private Films ninth = new Films(9, "Gladiator", "Drama");
    private Films tenth = new Films(10, "Ratatouille", "Animated film");

    Films[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

    @Test
    void mustShowTenMovie() {
        Manager manager = new Manager(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Films[] actual = manager.lastFilm(10);
        assertArrayEquals(expected, actual);
    }

    @Test
    void zeroMovie() {
        Manager manager = new Manager(0);
        Films[] actual = manager.lastFilm(0);
        Films[] expected = new Films[0];
        assertArrayEquals(expected, actual);

    }

    @Test
    void showOverMax() {
        Manager manager = new Manager(11);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Films[] actual = manager.lastFilm(10);
        assertArrayEquals(expected, actual);

    }

    @Test
    void mustShowSixthMovie() {
        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        Films[] actual = manager.lastFilm(6);
        Films[] expected = {sixth,fifth,fourth,third,second,first};
        assertArrayEquals(expected, actual);
    }
}
