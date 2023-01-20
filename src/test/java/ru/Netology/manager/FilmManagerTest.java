package ru.Netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void addNewFilm() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
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
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";

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
    public void LastEqualsLimit() {                           //Когда столько же//

        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";
        String film7 = "Film VII";
        String film8 = "Film VIII";
        String film9 = "Film IX";
        String film10 = "Film X";

        FilmManager manager = new FilmManager(10);

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

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void GetLastUpperLimit() {                          //Когда больше чем лимит//
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";

        FilmManager manager = new FilmManager(4);

        
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);


        String[] actual = manager.findLast();
        String[] expected = {film6, film5, film4, film3};


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void GetLastUnderLimit() {                             //Когда меньше чем лимит//
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III ";
        FilmManager manager = new FilmManager(4);

        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

}