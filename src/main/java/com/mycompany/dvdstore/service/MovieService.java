package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.FileMovieRepository;

public class MovieService {

    private FileMovieRepository movieRepository=new FileMovieRepository();

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }
}
