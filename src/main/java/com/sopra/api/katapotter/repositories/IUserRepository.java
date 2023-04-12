package com.sopra.api.katapotter.repositories;

import java.util.List;

import com.sopra.api.katapotter.entities.User;

public interface IUserRepository {

    public List<User> getAllUsers();
}
