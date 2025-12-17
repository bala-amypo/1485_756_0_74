package com.example.demo.service;
import java.util.List;
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
    public List<Location> getall(){
        return Locationrepo.findAll();
    }
    
}
