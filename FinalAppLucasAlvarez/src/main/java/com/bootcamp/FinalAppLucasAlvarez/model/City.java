package com.bootcamp.FinalAppLucasAlvarez.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name="CITIES")
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Long id;
    private String name;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<User> users;



    //CONSTRUCTORS--------------------------------------------------------------------------
    public City( String NAME){
                this.name = NAME;

    }
    public City(Long ID, String NAME){
            this.name = NAME;
            this.id = ID;

    }
    /*public String toString(){


        return this.name;
    }*/

    /*public String toString(){
        String info = "";
        JSONObject jsonInfo = new JSONObject();
        jsonInfo.put("name",this.name);

        JSONArray productArray = new JSONArray();
        if(this.products != null){
            this.products.forEach(product->{
                JSONObject subJson = new JSONObject();
                subJson.put("name", product.getName());
                productArray.put(subJson);
            });
        }
        jsonInfo.put("products", productArray);
        info = jsonInfo.toString();
        return info;
    }*/

}
