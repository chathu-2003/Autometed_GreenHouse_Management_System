package lk.ijse.gdse72.crop_service.controller;

import lk.ijse.gdse72.crop_service.entity.Crop;
import lk.ijse.gdse72.crop_service.repositiory.CropRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crops")
public class CropController {

    private final CropRepository repository;

    public CropController(CropRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Crop> getAllCrops() {
        return repository.findAll();
    }

    @PostMapping
    public Crop addCrop(@RequestBody Crop crop) {
        return repository.save(crop);
    }
}