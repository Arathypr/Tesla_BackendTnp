package com.example.finalapi.api.controller;


import com.example.finalapi.api.VehicleColor;
import com.example.finalapi.api.entity.ImageDetails;
import com.example.finalapi.api.service.ImageDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/imageDetails")
public class ImageDetailsController {

    @Autowired
    private ImageDetailsService imageDetailsService;

    @PostMapping("/postImageDetails")
    public String postImageDetails(@RequestParam String title, @RequestParam(required = false) String description, @RequestBody List<Object> vehicleImages) {
        return imageDetailsService.postImageDetails(title, description, vehicleImages);
    }

    @GetMapping("/getImageDetailsById")
    public Optional<ImageDetails> getImageDetailsById(@RequestParam Long imageId) {
        return imageDetailsService.getImageDetailsById(imageId);
    }

    @GetMapping("/getImageDetailsByVehicleIdAndImageIdAndColor")
    public Optional<ImageDetails> getImageDetailsByVehicleIdAndImageIdAndColor(@RequestParam Long vehicleId, @RequestParam Long imageId, @RequestParam VehicleColor color) {
        return imageDetailsService.getImageDetailsByVehicleIdAndImageIdAndColor(vehicleId, imageId, color);
    }
    @GetMapping("/getAllImageDetails")
    public List<ImageDetails> getAllImageDetails() {
        return imageDetailsService.getAllImageDetails();
    }

}

