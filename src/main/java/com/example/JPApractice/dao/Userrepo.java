package com.example.JPApractice.dao;

import com.example.JPApractice.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Userrepo extends CrudRepository<User, Integer> {
    public List<User> findByName(String name);
    public List<User> findByNameAndCity(String name, String city);
    @Query("select u from  User u")
    public List<User> getAllUser(String city);
}
