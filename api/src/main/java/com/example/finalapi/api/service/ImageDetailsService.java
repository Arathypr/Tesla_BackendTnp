package com.example.finalapi.api.service;


import com.example.finalapi.api.VehicleColor;
import com.example.finalapi.api.entity.ImageDetails;

import java.util.List;
import java.util.Optional;

public interface ImageDetailsService {
    String postImageDetails(String title, String description, List<Object> vehicleImages);
    Optional<ImageDetails> getImageDetailsById(Long imageId);
    List<ImageDetails> getImageDetailsList();
    String updateImageDetails(Long id, String title, String description, List<Object> vehicleImages);
    String deleteImageDetails(Long id);
    Optional<ImageDetails> getImageDetailsByVehicleIdAndImageIdAndColor(Long vehicleId, Long imageId, VehicleColor color);
    public List<ImageDetails> getAllImageDetails();

}
