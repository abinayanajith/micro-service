package com.abi.rent.controller;


import com.abi.rent.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rent.Rent;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/rents")
public class RentController {

    @Autowired
    RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Rent getRent(@PathVariable int id) {
        return rentService.findById(id);
    }

    @GetMapping
    public List<Rent> getAllRents(@PathVariable int id) {
        return rentService.findAll();
    }

    @RequestMapping("/test")
    public Rent test() {
        Rent r = new Rent();
        r.setCustomerId(1);
        r.setCurrentOdometer(1223);
        r.setRentFrom(LocalDateTime.now());
        r.setRentTill(LocalDateTime.of(2019, 12, 31, 00, 00, 00));
        r.setReturnLocation("Colombo");
        r.setVehicleId(1);

        return r;

    }
}
