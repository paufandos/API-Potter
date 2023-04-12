package com.sopra.api.katapotter.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sopra.api.katapotter.entities.User;
import com.sopra.api.katapotter.repositories.IUserRepository;

@Repository
public class UserRepository implements IUserRepository {

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(5, "Pau Fandos", "fandosgorrispau@gmail.com", "1234"));
        return users;
    }

}
