package com.bootcamp.FinalAppLucasAlvarez.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name="USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CITIES_id")
    private City city;



    //CONSTRUCTORS--------------------------------------------------------------------------

    public User ( String NAME, String EMAIL){


        this.name = NAME;
        this.email = EMAIL;

    }
    public User (Long id, String NAME, String EMAIL){

        this.id = id;
        this.name = NAME;
        this.email = EMAIL;

    }

    public User(String NAME, String EMAIL, City CITY){

        this.name = NAME;
        this.email = EMAIL;
        this.city = CITY;

    }

}
