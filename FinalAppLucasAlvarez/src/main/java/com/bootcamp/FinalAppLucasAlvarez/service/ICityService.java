package com.bootcamp.FinalAppLucasAlvarez.service;

import com.bootcamp.FinalAppLucasAlvarez.model.City;

import java.util.List;

public interface ICityService {


    List<City> findAll();

    City findById(Long id);

    void save(City city);

    void deleteById(Long id);


}
