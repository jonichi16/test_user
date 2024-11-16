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

    public String addUser(RegisterRequest request) {
        try {
            User user = User.builder()
                    .name(request.name())
                    .email(request.email())
                    .password(request.password())
                    .role(Role.USER)
                    .build();

            repository.save(user);

            return "Success";
        } catch (Exception e) {

            return "Something went wrong";
        }
    }

}
