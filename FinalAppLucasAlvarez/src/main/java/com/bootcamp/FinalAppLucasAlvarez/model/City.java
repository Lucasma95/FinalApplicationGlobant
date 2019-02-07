package com.bootcamp.FinalAppLucasAlvarez.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name="CITIES")
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Long id;
    private String name;




    //CONSTRUCTORS--------------------------------------------------------------------------



}
