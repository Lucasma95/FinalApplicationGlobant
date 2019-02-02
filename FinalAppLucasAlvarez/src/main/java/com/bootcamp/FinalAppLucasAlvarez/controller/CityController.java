package com.bootcamp.FinalAppLucasAlvarez.controller;


import com.bootcamp.FinalAppLucasAlvarez.model.City;
import com.bootcamp.FinalAppLucasAlvarez.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/cities")
public class CityController {

    @Autowired
    CityService CityService;


    @GetMapping(path="/add")
    public @ResponseBody
    String addNewCity(@RequestParam String Name) {

        City user = new City(Name);
        CityService.save(user);
        return "City Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<City> getAllCities(){

        return  CityService.findAll();

    }

    @GetMapping(path="/find")
    public @ResponseBody City GetCityById(@RequestParam Long id){

        return CityService.findById(id);

    }

    @GetMapping("/delete")
    public @ResponseBody String DeleteCityById(@RequestParam Long id){

        CityService.deleteById(id);

        return "City deleted";
    }
}
