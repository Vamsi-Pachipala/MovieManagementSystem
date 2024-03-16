package com.example.MovieManagementSystem.Service;

import com.example.MovieManagementSystem.Entity.Director;
import com.example.MovieManagementSystem.Entity.Movie;
import com.example.MovieManagementSystem.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(Movie movie){

        return movieRepository.addMovie(movie);
    }

    public String addDirector(Director director){

        return movieRepository.addDirector(director);
    }

    public String pairMovieAndDirector(String movieName, String directorName){
        return movieRepository.pairMovieAndDirector(movieName,directorName);
    }

    public List<Movie> getAllMovies(){
        return movieRepository.getAllMovies();
    }
}
