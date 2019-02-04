package com.bootcamp.FinalAppLucasAlvarez.controller;


import com.bootcamp.FinalAppLucasAlvarez.model.City;
import com.bootcamp.FinalAppLucasAlvarez.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/cities")
public class CityController {

    @Autowired
    CityService cityService;


    @GetMapping(path="/add")
    public @ResponseBody
    String addNewCity(@RequestParam String Name) {

        City city = new City(Name);
        cityService.save(city);
        return "City Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<City> getAllCities(){

        return  cityService.findAll();

    }

    @GetMapping(path="/find")
    public @ResponseBody City GetCityById(@RequestParam Long id){

        return cityService.findById(id);

    }

    @GetMapping("/delete")
    public @ResponseBody String DeleteCityById(@RequestParam Long id){

        cityService.deleteById(id);

        return "City deleted";
    }

    @GetMapping(path="/update")
    public @ResponseBody String UpdateUser( @RequestParam Long id,
                                            @RequestParam String Name) {

        City city = new City(id, Name);

        cityService.save(city);
        return "City Updated";


    }
}
