package com.galvanize.gmdb.gmdb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.gmdb.gmdb.Model.Review;
import com.galvanize.gmdb.gmdb.Repository.ReviewRepository;

@RestController
@RequestMapping("/reviews")
public class ReviewContrller {
    @Autowired
    private ReviewRepository reviewRepo;

    @GetMapping("/{movie_id}")
    public List<Review> reviewList(@PathVariable Integer movie_id ) {
        // Movie movie1 = new Movie("Harry Porter",1992,"Emotional",2400);
        // movieRepo.save(movie1);
        List<Review> moviesList = reviewRepo.findById(.esleThrow());
        return moviesList;
    }
}
