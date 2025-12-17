package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepo;

@Service
public class LocationServImp implements LocationServ {

    @Autowired
    private LocationRepo locationrepo;

    @Override
    public Location createlocation(Location location) {
        return locationrepo.save(location);
    }

    @Override
    public List<Location> getalllocation() {
        return locationrepo.findAll();
    }
}
