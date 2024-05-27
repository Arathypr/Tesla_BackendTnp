package com.example.finalapi.api.repo;

import com.example.finalapi.api.VehicleColor;
import com.example.finalapi.api.entity.VehicleImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleImageRepo extends JpaRepository<VehicleImage, Long> {
    List<VehicleImage> findByColor(VehicleColor color);
    Optional<VehicleImage> findByVehicleId(Long vehicleId);
    List<VehicleImage> findAll();
}
