package com.bootcamp.FinalAppLucasAlvarez.repository;


import com.bootcamp.FinalAppLucasAlvarez.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}
