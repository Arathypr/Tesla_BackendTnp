package com.example.finalapi.api.controller;


import com.example.finalapi.api.VehicleColor;
import com.example.finalapi.api.entity.VehicleImage;
import com.example.finalapi.api.service.VehicleImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vehicleImage")
public class VehicleImageController {

    @Autowired
    private VehicleImageService vehicleImageService;

    @PostMapping("/postVehicleImage")
    public String postVehicleImage(@RequestBody VehicleImage vehicleImage) {
        vehicleImageService.saveVehicleImage(vehicleImage);
        return "Successfully inserted VehicleImage data";
    }
    @GetMapping("/getVehicleImagesByColor")
    public List<VehicleImage> getVehicleImagesByColor(@RequestParam VehicleColor color) {
        return vehicleImageService.getVehicleImagesByColor(color);
    }
    @GetMapping("/getVehicleImageByVehicleId")
    public Optional<VehicleImage> getVehicleImageByVehicleId(@RequestParam Long vehicleId) {
        return vehicleImageService.getVehicleImageByVehicleId(vehicleId);
    }

    @GetMapping("/getAllVehicleImages")
    public List<VehicleImage> getAllVehicleImages() {
        return vehicleImageService.getAllVehicleImages();
    }




}


