package com.bootcamp.FinalAppLucasAlvarez.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private Set<User> users;

    public City( String NAME){
        this.name = NAME;

    }

    public City(Long id, String NAME){
        this.name = NAME;
        this.id = id;
    }

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    public Set<User> getUsers(){
        return users;

    }

    public void setUsers(Set<User> users){

        this.users = users;
    }



    @Override
    public String toString() {
        String result = String.format(
                "Category[id=%d, name='%s']%n",
                id, name);
        if (users != null) {
            for(User user : users) {
                result += String.format(
                        "User[id=%d, name='%s']%n",
                        user.getId(), user.getName());
            }
        }

        return result;
    }

}
