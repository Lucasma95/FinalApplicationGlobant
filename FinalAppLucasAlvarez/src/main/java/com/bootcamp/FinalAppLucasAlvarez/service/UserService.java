package com.bootcamp.FinalAppLucasAlvarez.service;

import com.bootcamp.FinalAppLucasAlvarez.model.User;
import com.bootcamp.FinalAppLucasAlvarez.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {

        List<User> users = (List<User>) repository.findAll();

        return users;
    }

    @Override
    public User findById(Long id) {

        User user = repository.findById(id).orElse(null);
        return user;
    }

    @Override
    public void save(User user) {

        repository.save(user);

    }
}
