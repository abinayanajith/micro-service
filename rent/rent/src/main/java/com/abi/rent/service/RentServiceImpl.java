package com.abi.rent.service;


import com.abi.rent.repository.RentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rent.Rent;

import java.util.List;
import java.util.Optional;

@Service
public class RentServiceImpl implements RentService{

    @Autowired
    RentRepo rentRepository;


    @Override
    public Rent save(Rent customer) {
        return rentRepository.save(customer);
    }


    @Override
    public Rent findById(int id) {
        Optional<Rent> rent = rentRepository.findById(id);

        if (rent.isPresent())
            return rent.get();
        else
            return new Rent();

    }


    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }
}
