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


    @GetMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String Name,
                      @RequestParam String Email) {

        User user = new User();

        user.setName(Name);
        user.setEmail(Email);

        userService.save(user);

        return "User Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return  userService.findAll();

    }
        //(value = "id")
    @GetMapping(path="/find")
    public User UserGetById(@PathVariable Long id){


            return userService.findById(id);




    }
}
