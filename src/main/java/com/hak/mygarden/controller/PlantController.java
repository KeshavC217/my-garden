package com.hak.mygarden.controller;

import com.hak.mygarden.models.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.hak.mygarden.repository.PlantRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class PlantController {
    @Autowired
    private PlantRepository plantRepository;

    //Get employee REST API

    @GetMapping("plants")
    public List<Plant> getAllPlants(){
        return this.plantRepository.findAll();
    }

    @PostMapping("plants")
    public Plant createPlant(@RequestBody Plant plant) {
        return this.plantRepository.save(plant);
    }

}
