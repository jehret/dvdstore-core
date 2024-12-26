package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;

public interface MovieServiceInterface {
    Movie registerMovie(Movie movie);
    Iterable<Movie> getMovieList();
    Movie getMovieById(long id);
}
