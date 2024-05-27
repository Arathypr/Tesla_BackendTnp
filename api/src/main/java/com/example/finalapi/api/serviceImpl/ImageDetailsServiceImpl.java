package com.example.finalapi.api.serviceImpl;

import com.example.finalapi.api.entity.ImageDetails;
import com.example.finalapi.api.entity.VehicleImage;
import com.example.finalapi.api.repo.ImageDetailsRepo;
import com.example.finalapi.api.service.ImageDetailsService;
import com.example.finalapi.api.VehicleColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ImageDetailsServiceImpl implements ImageDetailsService {

    @Autowired
    private ImageDetailsRepo imageDetailsRepo;

    @Override
    public String postImageDetails(String title, String description, List<Object> vehicleImages) {
        ImageDetails imageDetails = new ImageDetails();
        imageDetails.setTitle(title);
        imageDetails.setDescription(description);
        imageDetails.setVehicleImages(new ArrayList<>());

        for (Object obj : vehicleImages) {
            List<Object> vehicleImageDetails = (List<Object>) obj;
            VehicleImage vehicleImage = new VehicleImage();
            vehicleImage.setImageUrl(vehicleImageDetails.get(0).toString());
            vehicleImage.setColor(VehicleColor.valueOf(vehicleImageDetails.get(1).toString()));
            imageDetails.getVehicleImages().add(vehicleImage);
        }

        imageDetailsRepo.save(imageDetails);
        return "Successfully inserted image details data";
    }

    @Override
    public Optional<ImageDetails> getImageDetailsById(Long imageId) {
        return imageDetailsRepo.findById(imageId);
    }

    @Override
    public List<ImageDetails> getImageDetailsList() {
        return imageDetailsRepo.findAll();
    }

    @Override
    public String updateImageDetails(Long id, String title, String description, List<Object> vehicleImages) {
        return "";
    }

    @Override
    public String deleteImageDetails(Long id) {
        return "";
    }


    @Override
    public Optional<ImageDetails> getImageDetailsByVehicleIdAndImageIdAndColor(Long vehicleId, Long imageId, VehicleColor color) {
        Optional<ImageDetails> optionalImageDetails = imageDetailsRepo.findById(imageId);

        if (optionalImageDetails.isPresent()) {
            ImageDetails imageDetails = optionalImageDetails.get();
            for (VehicleImage vehicleImage : imageDetails.getVehicleImages()) {
                if (vehicleImage.getVehicleId().equals(vehicleId) && vehicleImage.getColor().equals(color)) {
                    return Optional.of(imageDetails);
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public List<ImageDetails> getAllImageDetails() {
        return imageDetailsRepo.findAll();
    }
}
