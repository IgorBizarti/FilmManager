package ru.Netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void addNewFilm() {
        String film1 = "Matrix";
        String film2 = "Home Alone";
        String film3 = "GodzilLa";
        String film4 = "Titanic";

        FilmManager manager = new FilmManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);

        String[] expected = {film1, film2, film3, film4};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast() {
        String film1 = "Matrix";
        String film2 = "Home Alone";
        String film3 = "GodzilLa";
        String film4 = "Titanic";

        FilmManager manager = new FilmManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);

        String[] expected = {film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void LastEqualsLimit() { //Когда столько же//

        String film1 = "Matrix";
        String film2 = "Home Alone";
        String film3 = "GodzilLa";
        String film4 = "Titanic";
        FilmManager manager = new FilmManager(4);

        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);

        String[] actual = manager.findLast();
        String[] expected = {film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void GetLastUpperLimit() { //Когда больше чем лимит//
        String film1 = "Matrix";
        String film2 = "Home Alone";
        String film3 = "GodzilLa";
        FilmManager manager = new FilmManager(20);

        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void GetLastUnderLimit() {//Когда меньше чем лимит//
        String film1 = "Matrix";
        String film2 = "Home Alone";
        String film3 = "GodzilLa";
        FilmManager manager = new FilmManager(4);

        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

}
