package com.sopra.api.katapotter.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sopra.api.katapotter.entities.User;


public class UsersServiceTest {

    @MockBean
    IUserService userService;

    @Test
    public void getAllUsersTestMustReturnUserList() throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User(5, "Pau", "pau@pau.pau", "1234"));

        userService = Mockito.mock(IUserService.class);
        Mockito.when(userService.getAllUsers()).thenReturn(users);

        assertEquals(userService.getAllUsers().get(0).getId(), 5);
    }

}
