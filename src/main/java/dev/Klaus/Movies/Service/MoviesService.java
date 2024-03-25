package dev.Klaus.Movies.Service;

import dev.Klaus.Movies.Model.Movie;

import java.util.List;

public interface MoviesService {
    List<Movie> getAllMovies();

    Movie getMovieByImdbId(String imdbId);
}
