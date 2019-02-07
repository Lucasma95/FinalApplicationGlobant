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
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CITIES_id")
    private City city;


    //, cascade = CascadeType.ALL
    //CONSTRUCTORS--------------------------------------------------------------------------





}
