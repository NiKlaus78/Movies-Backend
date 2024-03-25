package dev.Klaus.Movies.Repository;

import dev.Klaus.Movies.Model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepo extends MongoRepository<Movie, ObjectId> {

    Movie getMoviesByImdbId(String id);
}
