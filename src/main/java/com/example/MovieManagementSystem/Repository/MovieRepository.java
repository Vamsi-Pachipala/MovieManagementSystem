package com.example.MovieManagementSystem.Repository;

import com.example.MovieManagementSystem.Entity.Director;
import com.example.MovieManagementSystem.Entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MovieRepository {


    HashMap<String,Movie> movieDb = new HashMap<>();
    HashMap<String, Director> directorDb = new HashMap<>();

    HashMap<String,String> pair = new HashMap<>();

    public String addMovie(Movie movie){

        movieDb.put(movie.getName(),movie);

        return "Movie added successfully";
    }

    public String addDirector(Director director){

        directorDb.put(director.getName(),director);

        return "Director added successfully";
    }

    public String pairMovieAndDirector(String movieName,String directorName){
        pair.put(movieName,directorName);
        return "Paired them successfully";
    }
    public List<Movie> getAllMovies(){
        List<Movie> list = new ArrayList<>();

        for(Movie movie: movieDb.values()){
            list.add(movie);
        }
        return list;
    }
}
