package dev.Klaus.Movies.Service;

import dev.Klaus.Movies.Model.Review;
import org.springframework.http.HttpStatusCode;

public interface ReviewService {

    Review createReviews(String reviewBody, String imdbId);
}
