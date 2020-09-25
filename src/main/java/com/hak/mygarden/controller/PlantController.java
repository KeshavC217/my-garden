package com.hak.mygarden.controller;

import com.hak.mygarden.models.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.hak.mygarden.repository.PlantRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class PlantController {
    @Autowired
    private PlantRepository plantRepository;
    //Below is the REST API functionalities
    //Get all plants
    @GetMapping("plants")
    public List<Plant> getAllPlants(){
        return this.plantRepository.findAll();
    }

    // save plant
    @PostMapping("plants")
    public Plant createPlant(@RequestBody Plant plant) {
        return this.plantRepository.save(plant);
    }


}
