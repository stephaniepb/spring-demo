package com.example.demo1.repository;

import com.example.demo1.model.User;
import com.example.demo1.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void saveUser() {

        User user = User.builder()
                .name("Stephanie")
                .email("stephanie@email.com")
                .build();

        User save = userService.save(user);

        assertThat(save).isNotNull();
        assertThat(save.getName()).isEqualTo("Stephanie");
    }
}
