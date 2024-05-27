package com.example.finalapi.api.repo;

import com.example.finalapi.api.entity.ImageDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageDetailsRepo extends JpaRepository<ImageDetails, Long> {
    List<ImageDetails> findAll();

}


