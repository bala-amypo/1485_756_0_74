package com.example.demo.sevice;

import java.util.List;

import com.example.demo.entity.Location;

public interface LocationServ {
    Location createlocation (Location location);
    List<Location> getalllocation();
}
