package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;

public class MovieService {

    private GoLiveMovieRepository movieRepository;

    public void registerMovie(Movie movie){

        movieRepository.add(movie);
    }
}
