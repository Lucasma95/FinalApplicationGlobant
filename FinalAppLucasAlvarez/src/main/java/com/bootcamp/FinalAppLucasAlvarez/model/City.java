package com.bootcamp.FinalAppLucasAlvarez.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter @Setter @NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

   /* @OneToMany(mappedBy = "City", cascade = CascadeType.ALL)
    private Set<User> users;*/


    /*public City(String NAME, User... USERS) {
        this.name = name;
        this.users = Stream.of(USERS).collect(Collectors.toSet());
        this.users.forEach(x -> x.setCity(this));
    }*/

    public City(String NAME){

        this.name = NAME;

    }


}
