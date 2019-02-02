package com.bootcamp.FinalAppLucasAlvarez.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Getter @Setter @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;


    private String email;

    public User ( String NAME, String EMAIL){


        this.name = NAME;
        this.email = EMAIL;

    }

}
