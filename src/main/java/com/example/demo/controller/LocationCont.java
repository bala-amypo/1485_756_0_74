package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Location;
import com.example.demo.sevice.LocationServ;

@RestController
public class LocationCont {
    @Autowired
    LocationServ locationservice;
    @PostMapping("/addlocation")
    public Location add(RequestBody Location le){
        return locationservice.createlocation(le);
    }
    @GetMapping("/showlocation")
    public List<Location> show(){
        return LocationServ.getalllocation();
    }
}
