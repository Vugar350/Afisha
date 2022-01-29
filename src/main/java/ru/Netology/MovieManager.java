package ru.Netology;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int defaultMovieLength;


    MovieManager() {

    }

    public MovieManager(int defaultMovieLength) {
        this.defaultMovieLength = 10;

    }


    public void addMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastMovie = tmp.length - 1;
        tmp[lastMovie] = movie;
        movies = tmp;

    }

    public Movie[] getLastAdd() {
        if (movies.length > defaultMovieLength) {
            Movie[] result = new Movie[defaultMovieLength];
            for (int i = 0; i < result.length; i++) {
                int index = movies.length - i - 1;
                result[i] = this.movies[index];
            }
            return result;

        }
        else {
            Movie[] result = new Movie[movies.length];
            for (int i = 0; i < result.length; i++) {
                int index = result.length - i - 1;
                result[i] = this.movies[index];
            }
            return result;
        }

    }
}











