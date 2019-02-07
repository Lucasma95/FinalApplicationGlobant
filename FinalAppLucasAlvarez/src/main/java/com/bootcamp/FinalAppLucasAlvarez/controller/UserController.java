package com.bootcamp.FinalAppLucasAlvarez.controller;


import com.bootcamp.FinalAppLucasAlvarez.model.User;
import com.bootcamp.FinalAppLucasAlvarez.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestBody User user) {


        userService.save(user);
        return "User Saved";


    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return  userService.findAll();

    }

    @GetMapping(path="/find")
    public @ResponseBody User GetUserById(@RequestParam Long id){

            return userService.findById(id);

    }

    @DeleteMapping("/delete")
    public @ResponseBody String DeleteUserById(@RequestParam Long id){

        userService.deleteById(id);

        return "User deleted";
    }


    @PostMapping(path="/update")
    public @ResponseBody String UpdateUser(@RequestBody User user ) {

        userService.save(user);
        return "User Updated";


    }



}
