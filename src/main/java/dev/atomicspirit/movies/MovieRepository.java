package dev.atomicspirit.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//The repository is the data access layer
//You can highlight MongoRepository and hit ctrl+n to inspect the classes provided

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    //automatic  Dynamic Queries from property names

    Optional<Movie>  findMovieByImdbId(String imdbId);
}
