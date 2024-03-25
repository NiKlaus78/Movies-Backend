package dev.Klaus.Movies.ControllerAPI;

import dev.Klaus.Movies.Model.Review;
import dev.Klaus.Movies.Service.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/reviews")
public class ReviewAPI {

    @Autowired
    private ReviewServiceImpl reviewService;

    @PostMapping()
    public ResponseEntity<Review> createReviews(@RequestBody Map<String, String> payLoad){
        return new ResponseEntity<Review>(reviewService.createReviews(payLoad.get("reviewBody"),
                payLoad.get("ImdbId")), HttpStatus.CREATED);
    }

}
