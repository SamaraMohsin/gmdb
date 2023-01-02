package com.galvanize.gmdb.gmdb.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



// 1. As a user
    //    I can GET a list of movies from GMDB that includes Movie ID | Movie Title | Year Released | Genre | Runtime
    //    so that I can see the list of available movies.
@Entity
@Table(name = "movies")
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movie_id;

    private String title;
    private Integer year;
    private String genre;
    private long runtime;

    public Movie(){};
    
    public Movie(String title,Integer year,String genre,long runtime){
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.runtime = runtime;
    }
    
}
