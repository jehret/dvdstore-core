package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;


/**
 *
 *
 */
public class App 
{
    public static void main( String[] args ) {
        MovieController movieController=new MovieController();
        FileMovieRepository movieRepository=new FileMovieRepository();
        DefaultMovieService movieService=new DefaultMovieService();
        movieController.setMovieService(movieService);
        movieService.setMovieRepository(movieRepository);
        movieController.addUsingConsole();
    }
}
