package com.example.JPApractice.dao;

import com.example.JPApractice.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface Userrepo extends CrudRepository<User, Integer> {

}
