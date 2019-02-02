package com.bootcamp.FinalAppLucasAlvarez.service;

import com.bootcamp.FinalAppLucasAlvarez.model.User;

import java.util.List;

public interface IUserService  {

     List<User> findAll();

     User findById(Long id);

     void save(User user);
}
