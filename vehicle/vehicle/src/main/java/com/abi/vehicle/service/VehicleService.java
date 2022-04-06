package com.abi.vehicle.service;

import vehicle.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle save(Vehicle customer);

    Vehicle findById(int id);

    List<Vehicle> findAll();
}
