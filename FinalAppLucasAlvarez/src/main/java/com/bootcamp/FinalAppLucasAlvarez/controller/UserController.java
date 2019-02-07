package com.bootcamp.FinalAppLucasAlvarez.controller;


import com.bootcamp.FinalAppLucasAlvarez.model.City;
import com.bootcamp.FinalAppLucasAlvarez.model.User;
import com.bootcamp.FinalAppLucasAlvarez.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String Name,
                                           @RequestParam String Email,
                                           @RequestParam Long IdCity) {

        City city = new City(IdCity);
        User user = new User(Name, Email, city);
        userService.save(user);
        return "User Saved";


    }

    @GetMapping("/all")
    public @ResponseBody List<User> getAllUsers() {



        return  userService.findAll();


    }

    @GetMapping(path="/find")
    public @ResponseBody User GetUserById(@RequestParam Long id){

            return userService.findById(id);

    }

    @GetMapping("/delete")
    public @ResponseBody String DeleteUserById(@RequestParam Long id){

        userService.deleteById(id);

        return "User deleted";
    }

    @GetMapping(path="/update")
    public @ResponseBody String UpdateUser( @RequestParam Long id,
                                            @RequestParam String Name,
                                            @RequestParam String Email,
                                            @RequestParam Long IdCity,
                                            @RequestParam String CityName) {

        City city = new City(IdCity, CityName);
        User user = new User(id, Name, Email, city);

        userService.update(user);
        return "User Updated";


    }



}
