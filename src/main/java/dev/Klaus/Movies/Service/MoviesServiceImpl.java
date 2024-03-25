package dev.Klaus.Movies.Service;

import dev.Klaus.Movies.Model.Movie;
import dev.Klaus.Movies.Repository.MoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesServiceImpl implements MoviesService{

    @Autowired
    private MoviesRepo moviesRepo;

    @Override
    public List<Movie> getAllMovies() {
        return moviesRepo.findAll();
    }

    @Override
    public Movie getMovieByImdbId(String imdbId) {
        return moviesRepo.getMoviesByImdbId(imdbId);
    }

}
