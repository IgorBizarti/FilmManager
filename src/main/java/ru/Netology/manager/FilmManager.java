package ru.Netology.manager;

public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {
        this.limit = 10;
    }

    public void addNewFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;

    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

    public String[] findLast2() { //меньше чем лимит
        String[] tmp = new String[5];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }

    public String[] findLast3() { // больше чем лимит
        String[] tmp = new String[11];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

    public String[] findLast4() { // равно
        String[] tmp = new String[10];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}