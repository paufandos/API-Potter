package com.sopra.api.katapotter.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sopra.api.katapotter.entities.User;

@WebMvcTest
public class UsersRepositoryTest {

    @MockBean
    IUserRepository usersRepository;

    @Test
    public void getAllUsersTestMustReturnUserList() throws Exception {
        List<User> users = new ArrayList<User>();
        users.add(new User(5, "Pau Fandos", "fandosgorrispau@gmail.com", "1234"));

        usersRepository = Mockito.mock(IUserRepository.class);
        Mockito.when(usersRepository.getAllUsers()).thenReturn(users);

        assertEquals(usersRepository.getAllUsers().get(0).getId(), 5);
    }

}
