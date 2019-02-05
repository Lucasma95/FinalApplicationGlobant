package com.bootcamp.FinalAppLucasAlvarez.utils;

import com.bootcamp.FinalAppLucasAlvarez.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class UsersTransformer {

    //metodo para transformar una Lista en JSON para verlo en el navegador
    public static String toJSON(List<User> UsersList) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(UsersList);



    }
}
