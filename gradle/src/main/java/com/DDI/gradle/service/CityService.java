package com.DDI.gradle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.DDI.gradle.model.City;
import com.DDI.gradle.repository.CityRepository;

public class CityService implements ICityService{

    private final CityRepository repository;

    @Autowired
    public CityService(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<City> findAll() {

        return (List<City>) repository.findAll();
    }

}
