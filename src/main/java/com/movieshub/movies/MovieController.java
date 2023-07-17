package com.movieshub.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies") // This is like defining routes... CONTROLLER IS THE API LAYER
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public ResponseEntity<List<Movie>> getAllMovies() { // One can use String as return type... But this is more generic when dealing with requests.
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK); // Now it is also mandatory to return HttpStatus Response.
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String id) {
        return new ResponseEntity<>(movieService.singleMovie(id), HttpStatus.OK);
    }
}
