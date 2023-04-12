package com.sopra.api.katapotter.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.api.katapotter.entities.User;
import com.sopra.api.katapotter.repositories.IUserRepository;
import com.sopra.api.katapotter.services.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    public IUserRepository usersRepository;

    @Override
    public List<User> getAllUsers() {
        return usersRepository.getAllUsers();
    }
}
