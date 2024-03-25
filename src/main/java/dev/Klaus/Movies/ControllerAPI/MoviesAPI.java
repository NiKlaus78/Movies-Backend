package dev.Klaus.Movies.ControllerAPI;

import dev.Klaus.Movies.Model.Movie;
import dev.Klaus.Movies.Service.MoviesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1")
public class MoviesAPI {

    @Autowired
    private MoviesServiceImpl moviesService;

    @GetMapping("movies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(moviesService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("movies/{id}")
    public ResponseEntity<Movie> getMovieByImdbId(@PathVariable(name = "id") String imdbId){
        return new ResponseEntity<Movie>(moviesService.getMovieByImdbId(imdbId), HttpStatus.OK);
    }
}
