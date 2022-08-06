package com.example.blogan.users;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired private UserRepository userRepository;

    @Test
    @DisplayName("Can create user")
    public void canCreateUser() {
        UserEntity user = new UserEntity();
        user.username = "San123";
        user.email = "san@test.com";
        user.password = "abc123";

        userRepository.save(user);

        UserEntity savedUser = userRepository.findAll().get(0);

        assertEquals("San123", savedUser.username);

        System.out.println(savedUser);
    }
}
