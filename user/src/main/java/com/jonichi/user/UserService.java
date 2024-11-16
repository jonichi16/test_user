package com.jonichi.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> getUsers() {

        return repository.findAll();
    }

    public String addUser() {
        try {
            User user = User.builder()
                    .name("John Doe")
                    .email("doe@mail.com")
                    .password("12345")
                    .role(Role.USER)
                    .build();

            repository.save(user);

            return "Success";
        } catch (Exception e) {

            return "Something went wrong";
        }
    }

}
