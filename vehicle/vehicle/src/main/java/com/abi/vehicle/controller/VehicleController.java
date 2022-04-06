package com.abi.vehicle.controller;


import com.abi.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vehicle.Vehicle;

import java.util.List;

@RestController
@RequestMapping("/services/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping
    public Vehicle save(@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @GetMapping(value = "/{id}")
    public Vehicle getVehicle(@PathVariable int id) {
        return vehicleService.findById(id);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.findAll();
    }
}
