package com.movieshub.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// NOTE: Repository classes are of type Interface. Make sure to keep that in mind when creating new java class.

// A repository file acts as the data access layer for the application...
// It connects with the database and retrieve the data on which the operations are provided (which are specified in the service file)
@Repository // Defines that this file is a repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    public Optional<Movie> findMovieByImdbId(String id); // MONGODB is smart enough to read the function name and define what it does.
    // TYPOS IN FUNCTION NAME CAN CAUSE ISSUE!!
}
