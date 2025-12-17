package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Location;
import org.springframework.stereotype.Service;
import com.example.demo.repository.LocationRepo;

@Service
public class LocationServImp implements LocationServ {

    @Autowired
    private LocationRepo locationrepo;

    @Override
    public Location createlocation(Location le) {
        return locationrepo.save(le);
    }

    @Override
    public List<Location> getall() {
        return locationrepo.findAll();
    }

    @Override
    public List<Location> getAllLocation() {
        // Implement this method to satisfy the interface contract
        return locationrepo.findAll();  // assuming you want to return all locations
    }
}
