package com.example.demo.sevice;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocatioRepo;

public class LocationServImp implements LocationServ{
    @Autowired
    LocatioRepo Locationrepo;
    @Override
    public Location createlocation(Location le){
        return Locationrepo.save(le);
    }
}
