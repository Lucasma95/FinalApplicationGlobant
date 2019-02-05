package com.bootcamp.FinalAppLucasAlvarez.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/*import org.json.JSONArray;
import org.json.JSONObject;*/


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name="CITIES")
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private String name;


    //CONSTRUCTORS--------------------------------------------------------------------------


    public City(Long ID){

        this.id = ID;

    }
    public City( String NAME){
                this.name = NAME;

    }


}
