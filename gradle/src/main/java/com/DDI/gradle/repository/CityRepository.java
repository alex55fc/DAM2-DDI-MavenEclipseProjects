package com.DDI.gradle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DDI.gradle.model.City;

@Repository
public interface CityRepository extends CrudRepository<City,Long>{

}
