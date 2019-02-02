package com.bootcamp.FinalAppLucasAlvarez.service;

import com.bootcamp.FinalAppLucasAlvarez.model.City;
import com.bootcamp.FinalAppLucasAlvarez.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {


    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {
        List<City> allCities = (List<City>) repository.findAll();
        return allCities;
    }

    @Override
    public City findById(Long id) {
       City city = repository.findById(id).orElse(null);
       return city;
    }

    @Override
    public void save(City city) {

        repository.save(city);

    }

    @Override
    public void deleteById(Long id) {

        repository.deleteById(id);

    }
}
