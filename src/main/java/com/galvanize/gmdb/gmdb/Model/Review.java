package com.galvanize.gmdb.gmdb.Model;

import org.springframework.web.servlet.view.RedirectView;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// 2. As a user
//    I can provide a movie ID and get back the record shown in story 1, plus a list of reviews that contains Review ID | Movie ID | Reviewer ID | Review Text | DateTime last modified
//    so that I can read the reviews for a movie.

@Entity
@Table(name = "movies")
@Getter
@Setter
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer review_id;

    private String review_text;
    private Integer dateTime_last_modified;
   

    public Review(Integer review_id,String review_text,Integer dateTime_last_modified){
        this.review_id = review_id;
        this.review_id = review_id;
        this.review_text = review_text;
        this.dateTime_last_modified = dateTime_last_modified;
    };
    
    public Review(){
    }
}
