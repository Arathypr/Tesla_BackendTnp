package com.example.finalapi.api.serviceImpl;

import com.example.finalapi.api.VehicleColor;
import com.example.finalapi.api.entity.VehicleImage;
import com.example.finalapi.api.repo.VehicleImageRepo;
import com.example.finalapi.api.service.VehicleImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleImageServiceImpl implements VehicleImageService {

    @Autowired
    private VehicleImageRepo vehicleImageRepo;

    @Override
    public Optional<VehicleImage> getVehicleImageById(Long id) {
        return vehicleImageRepo.findById(id);
    }

    @Override
    public void saveVehicleImage(VehicleImage vehicleImage) {
        vehicleImageRepo.save(vehicleImage);
    }

    @Override
    public List<VehicleImage> getVehicleImagesByColor(VehicleColor color) {
        return vehicleImageRepo.findByColor(color);
    }

    @Override
    public Optional<VehicleImage> getVehicleImageByVehicleId(Long vehicleId) {
        return vehicleImageRepo.findByVehicleId(vehicleId);
    }

    @Override
    public List<VehicleImage> getAllVehicleImages() {
        return vehicleImageRepo.findAll();
    }

}
