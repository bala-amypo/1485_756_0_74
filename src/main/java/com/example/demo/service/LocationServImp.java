package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Location;
import org.springframework.stereotype.Service;
import com.example.demo.repository.LocatioRepo;
@Service
public class LocationServImp implements LocationServ{
    @Autowired
    LocatioRepo locationrepo;
    @Override
    public Location createlocation(Location le){
        return locationrepo.save(le);
    }
    public List<Location> getall(){
        return locationrepo.findAll();
    }
    
}
