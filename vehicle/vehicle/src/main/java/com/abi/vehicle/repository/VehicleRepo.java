package com.abi.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vehicle.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {
}
