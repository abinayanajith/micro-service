package com.abi.rent.service;

import rent.Rent;

import java.util.List;

public interface RentService {

    Rent save(Rent customer);

    Rent findById(int id);

    List<Rent> findAll();
}
