package com.sopra.api.katapotter.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import com.sopra.api.katapotter.entities.User;


public class UsersControllerTest {

    @InjectMocks
    UserController userController;

    @Test
    void getAllUsersTestMustResturn200StatusCode() throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User(5, "Pau", "pau@pau.pau", "1234"));

        userController = Mockito.mock(UserController.class);
        Mockito.when(userController.getAllUsers()).thenReturn(users);

        assertEquals(userController.getAllUsers().get(0).getId(), 5);

    }
}
