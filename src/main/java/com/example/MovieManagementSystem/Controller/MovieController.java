package com.example.MovieManagementSystem.Controller;


import com.example.MovieManagementSystem.Entity.Director;
import com.example.MovieManagementSystem.Entity.Movie;
import com.example.MovieManagementSystem.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){
        String ans= movieService.addMovie(movie);
        return new ResponseEntity<>(ans, HttpStatus.CREATED);
    }
    @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequestBody Director director){
        String ans= movieService.addDirector(director);
        return new ResponseEntity<>(ans, HttpStatus.CREATED);
    }

    @PostMapping("/pair-director-movie")
    public ResponseEntity<String> pairDirectorAndMovie(@RequestParam("movieName") String movieName,
                                               @RequestParam("directorName") String directorName){
        String ans = movieService.pairMovieAndDirector(movieName,directorName);

        return new ResponseEntity<>(ans, HttpStatus.CREATED);
    }

    @GetMapping("get-all-movies")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }
}
