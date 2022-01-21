package ru.Netology;

public class Manager {
    private Films[] film = new Films[0];
    private int defaultMovieLength = 10;

    Manager() {

    }
    public Manager(int customMovieLength) {

    }


    public void add(Films movie) {
        int length = film.length + 1;
        Films[] tmp = new Films[length];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = movie;
        film = tmp;
    }

    public Films[] lastFilm() {
        int filmLength = film.length;
        if (filmLength < defaultMovieLength) {
            defaultMovieLength = filmLength;
        }
        Films[] customFilms = new Films[defaultMovieLength];
        for (int i = 0; i < customFilms.length; i++) {
            int result = filmLength - i - 1;
            customFilms[i] = film[result];
        }
        return customFilms;
    }

}








