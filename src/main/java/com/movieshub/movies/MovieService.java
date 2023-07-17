package com.movieshub.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Service files are where the business logic goes...
public class MovieService {
    @Autowired // This is used to auto instantiate the objects for dependency injection
    private MovieRepository movieRepository; // To use it first you need to instantiate it;
    public List<Movie> allMovies() {
        return movieRepository.findAll(); // It performs operations to retrieve information from the database.
    }

    public Optional<Movie> singleMovie(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
