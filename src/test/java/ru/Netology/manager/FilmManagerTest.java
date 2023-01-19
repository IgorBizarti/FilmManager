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
    void findLustUnderLimit() {
        String film1 = "Matrix";
        String film2 = "Home Alone";
        String film3 = "GodzilLa";
        String film4 = "Titanic";
        String film5 = "Brave Heart";


        FilmManager manager = new FilmManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);

        String[] expected = {film5, film4, film3, film2, film1};
        String[] actual = manager.findLast2();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void addAboveLimit() {
        String film1 = "Matrix";
        String film2 = "Home Alone";
        String film3 = "GodzilLa";
        String film4 = "Titanic";
        String film5 = "Brave Heart";
        String film6 = "Independence Day";
        String film7 = "I am a Hero";
        String film8 = "Blue Deep";
        String film9 = "Tarzan";
        String film10 = "Madagaskar";
        String film11 = "Spider Man";

        FilmManager manager = new FilmManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);
        manager.addNewFilm(film7);
        manager.addNewFilm(film8);
        manager.addNewFilm(film9);
        manager.addNewFilm(film10);
        manager.addNewFilm(film11);

        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast3();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void saveEqualLimit() {
        String film1 = "Matrix";
        String film2 = "Home Alone";
        String film3 = "GodzilLa";
        String film4 = "Titanic";
        String film5 = "Brave Heart";
        String film6 = "Independence Day";
        String film7 = "I am a Hero";
        String film8 = "Blue Deep";
        String film9 = "Tarzan";
        String film10 = "Madagaskar";


        FilmManager manager = new FilmManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);
        manager.addNewFilm(film7);
        manager.addNewFilm(film8);
        manager.addNewFilm(film9);
        manager.addNewFilm(film10);

        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast4();

        Assertions.assertArrayEquals(expected, actual);

    }
}
