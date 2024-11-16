package com.jonichi.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("")
    public List<User> getUsers() {

        return service.getUsers();
    }

    @PostMapping("")
    public String addUser(
            @RequestBody RegisterRequest request
    ) {
        return service.addUser();
    }

}
