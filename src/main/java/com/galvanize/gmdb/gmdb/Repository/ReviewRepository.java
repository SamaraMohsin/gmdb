package com.galvanize.gmdb.gmdb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galvanize.gmdb.gmdb.Model.Review;

public interface ReviewRepository extends JpaRepository<Review,Integer> {
    
}
