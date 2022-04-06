package com.abi.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rent.Rent;

public interface RentRepo extends JpaRepository<Rent,Integer>{
}
