package com.bootcamp.FinalAppLucasAlvarez.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/welcome")
    public String Hello(@RequestParam(value = "names")String name ,
                        @RequestParam(value = "companies") String company) {


        return "Welcome to "+company+" "+name;

    }

    @PostMapping("/welcome")
    public String retBody(@RequestBody String body) {

        return body;
    }

}
