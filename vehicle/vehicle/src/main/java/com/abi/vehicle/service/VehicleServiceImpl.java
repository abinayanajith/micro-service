package com.abi.vehicle.service;

import com.abi.vehicle.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepo vehicleRepository;


    @Override
    public Vehicle save(Vehicle customer) {
        return vehicleRepository.save(customer);
    }


    @Override
    public Vehicle findById(int id) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(id);

        if (vehicle.isPresent())
            return vehicle.get();
        else
            return new Vehicle();

    }


    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }
}
