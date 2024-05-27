package com.example.finalapi.api.service;

import com.example.finalapi.api.VehicleColor;
import com.example.finalapi.api.entity.VehicleImage;

import java.util.List;
import java.util.Optional;

public interface VehicleImageService {
    Optional<VehicleImage> getVehicleImageById(Long id);
    void saveVehicleImage(VehicleImage vehicleImage);
    List<VehicleImage> getVehicleImagesByColor(VehicleColor color);
    public Optional<VehicleImage> getVehicleImageByVehicleId(Long vehicleId);
    List<VehicleImage> getAllVehicleImages();
}





