package com.bootcamp.FinalAppLucasAlvarez.repository;


import com.bootcamp.FinalAppLucasAlvarez.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long>, JpaRepository<City, Long> {
}
