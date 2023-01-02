package com.galvanize.gmdb.gmdb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.gmdb.gmdb.Model.Movie;
import com.galvanize.gmdb.gmdb.Repository.MovieRepository;

@RestController
@RequestMapping("/movies")

public class MovieController {

    @Autowired
    private MovieRepository movieRepo;

    @GetMapping("")
    public List<Movie> movieList() {
        // Movie movie1 = new Movie("Harry Porter",1992,"Emotional",2400);
        // movieRepo.save(movie1);
        List<Movie> moviesList = movieRepo.findAll();
        return moviesList;
    }
    
}
