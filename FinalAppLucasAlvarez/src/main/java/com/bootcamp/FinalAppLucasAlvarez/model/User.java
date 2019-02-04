package com.bootcamp.FinalAppLucasAlvarez.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private String email;
    private City city;
    /*@ManyToOne
    @JoinColumn
    private int idCity ;*/

    public User ( String NAME, String EMAIL){


        this.name = NAME;
        this.email = EMAIL;

    }
    public User (Long id, String NAME, String EMAIL){

        this.id = id;
        this.name = NAME;
        this.email = EMAIL;

    }


    @ManyToOne
    @JoinColumn(name = "city_id")
    public City getCity(){

        return city;
    }

    public void setCity(City cityp){

        this.city = cityp;
    }
    /*@ManyToOne
    @JoinColumn(name = "book_category_id")
    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }*/

}
